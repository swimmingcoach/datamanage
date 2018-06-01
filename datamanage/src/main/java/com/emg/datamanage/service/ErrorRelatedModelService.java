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
import com.emg.datamanage.dao.errorlog.ErrorRelatedModelDao;
import com.emg.datamanage.pojo.ErrorRelatedModelExample;
import com.emg.datamanage.pojo.ErrorRelatedModel;

@Service
public class ErrorRelatedModelService {
	@Autowired
	private ErrorRelatedModelDao errorRelatedModelDao;

	public ModelAndView insert(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLSet set = params.getSet();
		if(set.isEmpty()) {
			json.addObject("status", false);
			json.addObject("option", "set is empty");
			return json;
		}
		ErrorRelatedModel record = (ErrorRelatedModel) CommonConvertUtils.set2Model(set, ErrorRelatedModel.class);
		Integer count = errorRelatedModelDao.insertSelective(record);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}
	
	public ModelAndView count(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		ErrorRelatedModelExample example = (ErrorRelatedModelExample) CommonConvertUtils.where2Example(where, ErrorRelatedModelExample.class, ErrorRelatedModel.class);
		Integer count = errorRelatedModelDao.countByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView delete(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		ErrorRelatedModelExample example = (ErrorRelatedModelExample) CommonConvertUtils.where2Example(where, ErrorRelatedModelExample.class, ErrorRelatedModel.class);
		Integer count = errorRelatedModelDao.deleteByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView select(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		ErrorRelatedModelExample example = (ErrorRelatedModelExample) CommonConvertUtils.where2Example(where, ErrorRelatedModelExample.class, ErrorRelatedModel.class);
		if (params.getOrderBy() != null && !params.getOrderBy().isEmpty()) {
			example.setOrderByClause(params.getOrderBy());
		}
		List<ErrorRelatedModel> rows = errorRelatedModelDao.selectByExample(example);
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
		ErrorRelatedModel record = (ErrorRelatedModel) CommonConvertUtils.set2Model(set, ErrorRelatedModel.class);
		SQLWhere where = params.getWhere();
		ErrorRelatedModelExample example = (ErrorRelatedModelExample) CommonConvertUtils.where2Example(where, ErrorRelatedModelExample.class, ErrorRelatedModel.class);
		Integer count = errorRelatedModelDao.updateByExampleSelective(record, example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}
}
