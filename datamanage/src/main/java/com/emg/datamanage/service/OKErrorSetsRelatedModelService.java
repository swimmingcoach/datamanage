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
import com.emg.datamanage.dao.okresults.OKErrorSetsRelatedModelDao;
import com.emg.datamanage.pojo.OKErrorSetsRelatedModel;
import com.emg.datamanage.pojo.OKErrorSetsRelatedModelExample;

@Service
public class OKErrorSetsRelatedModelService {
	@Autowired
	private OKErrorSetsRelatedModelDao okErrorSetsRelatedModelDao;

	public ModelAndView insert(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLSet set = params.getSet();
		if(set.isEmpty()) {
			json.addObject("status", false);
			json.addObject("option", "set is empty");
			return json;
		}
		OKErrorSetsRelatedModel record = (OKErrorSetsRelatedModel) CommonConvertUtils.set2Model(set, OKErrorSetsRelatedModel.class);
		Integer count = okErrorSetsRelatedModelDao.insertSelective(record);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView count(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		OKErrorSetsRelatedModelExample example = (OKErrorSetsRelatedModelExample) CommonConvertUtils.where2Example(where, OKErrorSetsRelatedModelExample.class, OKErrorSetsRelatedModel.class);
		Integer count = okErrorSetsRelatedModelDao.countByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView delete(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		OKErrorSetsRelatedModelExample example = (OKErrorSetsRelatedModelExample) CommonConvertUtils.where2Example(where, OKErrorSetsRelatedModelExample.class, OKErrorSetsRelatedModel.class);
		Integer count = okErrorSetsRelatedModelDao.deleteByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView select(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		OKErrorSetsRelatedModelExample example = (OKErrorSetsRelatedModelExample) CommonConvertUtils.where2Example(where, OKErrorSetsRelatedModelExample.class, OKErrorSetsRelatedModel.class);
		if (params.getOrderBy() != null && !params.getOrderBy().isEmpty()) {
			example.setOrderByClause(params.getOrderBy());
		}
		List<OKErrorSetsRelatedModel> rows = okErrorSetsRelatedModelDao.selectByExample(example);
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
		OKErrorSetsRelatedModel record = (OKErrorSetsRelatedModel) CommonConvertUtils.set2Model(set, OKErrorSetsRelatedModel.class);
		SQLWhere where = params.getWhere();
		OKErrorSetsRelatedModelExample example = (OKErrorSetsRelatedModelExample) CommonConvertUtils.where2Example(where, OKErrorSetsRelatedModelExample.class, OKErrorSetsRelatedModel.class);
		Integer count = okErrorSetsRelatedModelDao.updateByExampleSelective(record, example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}
}
