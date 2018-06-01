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
import com.emg.datamanage.dao.errorlog.MaxidModelDao;
import com.emg.datamanage.pojo.MaxidModel;
import com.emg.datamanage.pojo.MaxidModelExample;

@Service
public class MaxidModelService {
	@Autowired
	private MaxidModelDao maxidModelDao;

	public ModelAndView insert(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLSet set = params.getSet();
		if (set.isEmpty()) {
			json.addObject("status", false);
			json.addObject("option", "set is empty");
			return json;
		}
		MaxidModel record = (MaxidModel) CommonConvertUtils.set2Model(set, MaxidModel.class);
		Integer count = maxidModelDao.insertSelective(record);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView count(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		MaxidModelExample example = (MaxidModelExample) CommonConvertUtils.where2Example(where, MaxidModelExample.class, MaxidModel.class);
		Integer count = maxidModelDao.countByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView delete(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		MaxidModelExample example = (MaxidModelExample) CommonConvertUtils.where2Example(where, MaxidModelExample.class, MaxidModel.class);
		Integer count = maxidModelDao.deleteByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView select(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		MaxidModelExample example = (MaxidModelExample) CommonConvertUtils.where2Example(where, MaxidModelExample.class, MaxidModel.class);
		if (params.getOrderBy() != null && !params.getOrderBy().isEmpty()) {
			example.setOrderByClause(params.getOrderBy());
		}
		List<MaxidModel> rows = maxidModelDao.selectByExample(example);
		json.addObject("status", true);
		json.addObject("option", rows);
		return json;
	};

	public ModelAndView update(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLSet set = params.getSet();
		if (set.isEmpty()) {
			json.addObject("status", false);
			json.addObject("option", "set is empty");
			return json;
		}
		MaxidModel record = (MaxidModel) CommonConvertUtils.set2Model(set, MaxidModel.class);
		SQLWhere where = params.getWhere();
		MaxidModelExample example = (MaxidModelExample) CommonConvertUtils.where2Example(where, MaxidModelExample.class, MaxidModel.class);
		if (maxidModelDao.updateByExampleSelective(record, example) > 0) {
			json.addObject("status", true);
			json.addObject("option", record.getMaxid());
		} else {
			json.addObject("status", false);
			json.addObject("option", -1);
		}
		return json;
	}
}
