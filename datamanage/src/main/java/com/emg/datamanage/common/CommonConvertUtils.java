package com.emg.datamanage.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.ConvertUtils;

import com.emg.datamanage.bean.SQLOperationalCharacter;
import com.emg.datamanage.bean.SQLOperationalLine;
import com.emg.datamanage.bean.SQLSet;
import com.emg.datamanage.bean.SQLWhere;
import com.emg.datamanage.bean.SQLWhereOr;

public class CommonConvertUtils {
	public static Object set2Model(SQLSet set, Class<?> modelClass) throws Exception {
		Object model = modelClass.newInstance();

		if (set.isEmpty())
			return model;

		List<SQLOperationalLine> optLines = set.getOperationalLines();
		for (SQLOperationalLine optLine : optLines) {
			String columnName = optLine.getColumnName();
			String value = optLine.getValue();

			if (columnName == null || columnName.isEmpty())
				continue;

			if (columnName.contains("_")) {
				columnName = CamelUtils.underlineToCamel(columnName);
			}

			Field columnField = modelClass.getDeclaredField(columnName);

			StringBuilder methodName = new StringBuilder();
			methodName.append("set");
			methodName.append(columnName.substring(0, 1).toUpperCase() + columnName.substring(1));

			Method method = modelClass.getMethod(methodName.toString(), columnField.getType());
			method.invoke(model, ConvertUtils.convert(value, columnField.getType()));
		}
		return model;
	}

	public static Object where2Example(SQLWhere where, Class<?> exampleClass, Class<?> modelClass) throws Exception {
		Object example = exampleClass.newInstance();

		if (where.isEmpty())
			return example;

		List<SQLWhereOr> whereOrs = where.getWhereOrs();
		for (SQLWhereOr whereOr : whereOrs) {
			Method methodOr = exampleClass.getMethod("or");
			Object criteria = methodOr.invoke(example);
			List<SQLOperationalLine> operationalLines = whereOr.getOperationalLines();
			for (SQLOperationalLine operationalLine : operationalLines) {
				String columnName = operationalLine.getColumnName();
				SQLOperationalCharacter optCharater = operationalLine.getOptCharater();
				String value = operationalLine.getValue();

				if (columnName == null || columnName.isEmpty())
					continue;

				Field columnField = modelClass.getDeclaredField(columnName);

				StringBuilder methodName = new StringBuilder();
				methodName.append("and");
				methodName.append(columnName);
				methodName.append(optCharater.getCharacter());
				Method[] methods = criteria.getClass().getMethods();
				for (Method method : methods) {
					String name = method.getName();
					if (name.equalsIgnoreCase(methodName.toString())) {
						Integer paramsCount = method.getParameterCount();
						Class<?>[] paramsTypes = method.getParameterTypes();
						if (paramsCount.equals(0)) {
							method.invoke(criteria);
						} else if (paramsCount.equals(1)) {
							Class<?> paramsType = paramsTypes[0];
							if (paramsType.getName().equals("java.util.List")) {
								List<Object> l = new ArrayList<Object>();
								for (String v : value.split(",")) {
									l.add(ConvertUtils.convert(v, columnField.getType()));
								}
								method.invoke(criteria, l);
							} else {
								method.invoke(criteria, ConvertUtils.convert(value, paramsType));
							}

						} else if (paramsCount.equals(2)) {
							String[] v = value.split(",");
							if (v.length >= 2) {
								method.invoke(criteria, ConvertUtils.convert(v[0], paramsTypes[0]), ConvertUtils.convert(v[1], paramsTypes[1]));
							} else {
								throw new Exception("column " + columnName + " value error: " + value);
							}
						} else {

						}
						break;
					}
				}
			}
		}
		return example;
	}
}
