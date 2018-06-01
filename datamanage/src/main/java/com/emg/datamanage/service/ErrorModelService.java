package com.emg.datamanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.emg.datamanage.bean.RequestModule;
import com.emg.datamanage.bean.SQLSet;
import com.emg.datamanage.bean.SQLWhere;
import com.emg.datamanage.common.CommonConvertUtils;
import com.emg.datamanage.dao.errorlog.ErrorModelDao;
import com.emg.datamanage.pojo.ErrorModel;
import com.emg.datamanage.pojo.ErrorModelExample;

@Service
public class ErrorModelService {
	@Autowired
	private ErrorModelDao errorModelDao;

	public ModelAndView insert(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLSet set = params.getSet();
		if(set.isEmpty()) {
			json.addObject("status", false);
			json.addObject("option", "set is empty");
			return json;
		}
		ErrorModel record = (ErrorModel) CommonConvertUtils.set2Model(set, ErrorModel.class);
		Integer count = errorModelDao.insertSelective(record);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView count(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		ErrorModelExample example = (ErrorModelExample) CommonConvertUtils.where2Example(where, ErrorModelExample.class, ErrorModel.class);
		Integer count = errorModelDao.countByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView delete(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		ErrorModelExample example = (ErrorModelExample) CommonConvertUtils.where2Example(where, ErrorModelExample.class, ErrorModel.class);
		Integer count = errorModelDao.deleteByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView select(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		ErrorModelExample example = (ErrorModelExample) CommonConvertUtils.where2Example(where, ErrorModelExample.class, ErrorModel.class);
		if (params.getOrderBy() != null && !params.getOrderBy().isEmpty()) {
			example.setOrderByClause(params.getOrderBy());
		}
		List<ErrorModel> rows = errorModelDao.selectByExample(example);
		json.addObject("status", true);
		json.addObject("option", rows);
		return json;
	};
	
	public ModelAndView update(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLSet set = params.getSet();
		if(set.isEmpty()) {
			json.addObject("status", false);
			json.addObject("option", "set is empty");
			return json;
		}
		ErrorModel record = (ErrorModel) CommonConvertUtils.set2Model(set, ErrorModel.class);
		SQLWhere where = params.getWhere();
		ErrorModelExample example = (ErrorModelExample) CommonConvertUtils.where2Example(where, ErrorModelExample.class, ErrorModel.class);
		Integer count = errorModelDao.updateByExampleSelective(record, example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}
}
