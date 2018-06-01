package com.emg.datamanage.converter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.emg.datamanage.bean.RequestModule;
import com.emg.datamanage.bean.SQLOperationalCharacter;
import com.emg.datamanage.bean.SQLOperationalLine;
import com.emg.datamanage.bean.SQLSet;
import com.emg.datamanage.bean.SQLWhere;
import com.emg.datamanage.bean.SQLWhereOr;

@Component
public class RequestModuleConverter implements Converter<String, RequestModule> {
	@Override
	public RequestModule convert(String source) {
		RequestModule requestModule = new RequestModule();
		try {
			if (source != null && source.length() > 0) {
				Map<String, Object> map = new HashMap<String, Object>();
				JSONObject obj = JSONObject.fromObject(source);
				for (Iterator<?> iter = obj.keys(); iter.hasNext();) {
					String key = (String) iter.next();
					String value = obj.get(key).toString();

					switch (key) {
					case "set":
						SQLSet set = new SQLSet();
						JSONArray objSets = JSONArray.fromObject(value);
						for (int i = 0; i < objSets.size(); i++) {
							JSONObject objOptLine = objSets.getJSONObject(i);
							SQLOperationalLine optLine = new SQLOperationalLine();
							optLine.setColumnName(objOptLine.getString("columnName"));
							optLine.setOptCharater(SQLOperationalCharacter.EQUALTO);
							optLine.setValue(objOptLine.getString("value"));
							set.addOperationalLine(optLine);
						}
						requestModule.setSet(set);
						break;
					case "where":
						SQLWhere where = new SQLWhere();
						JSONArray objWhereors = JSONArray.fromObject(value);
						for (int i = 0; i < objWhereors.size(); i++) {
							SQLWhereOr whereor = new SQLWhereOr();
							JSONArray objWhereor = objWhereors.getJSONArray(i);
							if (!objWhereor.isEmpty()) {
								for (int j = 0; j < objWhereor.size(); j++) {
									JSONObject objOptLine = objWhereor.getJSONObject(j);
									SQLOperationalLine optLine = new SQLOperationalLine();
									optLine.setColumnName(objOptLine.getString("columnName"));
									optLine.setOptCharater(SQLOperationalCharacter.valueOf(objOptLine.getString("optCharater")));
									optLine.setValue(objOptLine.getString("value"));
									whereor.addSQLOperationalLine(optLine);
								}
							}
							where.addWhereOr(whereor);
						}
						requestModule.setWhere(where);
						break;
					case "groupBy":
						break;
					case "orderBy":
						requestModule.setOrderBy(value);
						break;
					case "limit":
						break;
					case "offset":
						break;
					default:
						map.put(key, value);
						break;
					}
				}
				requestModule.setReqParams(map);
				requestModule.setSource(source);
			}
		} catch (Exception e) {
			e.printStackTrace();
			requestModule = new RequestModule();
		}
		return requestModule;
	}
}
