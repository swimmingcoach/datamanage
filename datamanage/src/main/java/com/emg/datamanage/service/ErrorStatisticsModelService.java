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
import com.emg.datamanage.dao.errorlog.ErrorStatisticsModelDao;
import com.emg.datamanage.pojo.ErrorStatisticsModel;
import com.emg.datamanage.pojo.ErrorStatisticsModelExample;

@Service
public class ErrorStatisticsModelService {
	@Autowired
	private ErrorStatisticsModelDao errorStatisticsModelDao;

	public ModelAndView insert(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLSet set = params.getSet();
		if(set.isEmpty()) {
			json.addObject("status", false);
			json.addObject("option", "set is empty");
			return json;
		}
		ErrorStatisticsModel record = (ErrorStatisticsModel) CommonConvertUtils.set2Model(set, ErrorStatisticsModel.class);
		Integer count = errorStatisticsModelDao.insertSelective(record);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}
	
	public ModelAndView count(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		ErrorStatisticsModelExample example = (ErrorStatisticsModelExample) CommonConvertUtils.where2Example(where, ErrorStatisticsModelExample.class, ErrorStatisticsModel.class);
		Integer count = errorStatisticsModelDao.countByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView delete(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		ErrorStatisticsModelExample example = (ErrorStatisticsModelExample) CommonConvertUtils.where2Example(where, ErrorStatisticsModelExample.class, ErrorStatisticsModel.class);
		Integer count = errorStatisticsModelDao.deleteByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView select(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		ErrorStatisticsModelExample example = (ErrorStatisticsModelExample) CommonConvertUtils.where2Example(where, ErrorStatisticsModelExample.class, ErrorStatisticsModel.class);
		if (params.getOrderBy() != null && !params.getOrderBy().isEmpty()) {
			example.setOrderByClause(params.getOrderBy());
		}
		List<ErrorStatisticsModel> rows = errorStatisticsModelDao.selectByExample(example);
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
		ErrorStatisticsModel record = (ErrorStatisticsModel) CommonConvertUtils.set2Model(set, ErrorStatisticsModel.class);
		SQLWhere where = params.getWhere();
		ErrorStatisticsModelExample example = (ErrorStatisticsModelExample) CommonConvertUtils.where2Example(where, ErrorStatisticsModelExample.class, ErrorStatisticsModel.class);
		Integer count = errorStatisticsModelDao.updateByExampleSelective(record, example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}
}
