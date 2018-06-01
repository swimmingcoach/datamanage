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
import com.emg.datamanage.dao.okresults.OKErrorSetsModelDao;
import com.emg.datamanage.pojo.OKErrorSetsModel;
import com.emg.datamanage.pojo.OKErrorSetsModelExample;

@Service
public class OKErrorSetsModelService {
	@Autowired
	private OKErrorSetsModelDao okErrorSetsModelDao;

	public ModelAndView insert(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLSet set = params.getSet();
		if(set.isEmpty()) {
			json.addObject("status", false);
			json.addObject("option", "set is empty");
			return json;
		}
		OKErrorSetsModel record = (OKErrorSetsModel) CommonConvertUtils.set2Model(set, OKErrorSetsModel.class);
		Integer count = okErrorSetsModelDao.insertSelective(record);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView count(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		OKErrorSetsModelExample example = (OKErrorSetsModelExample) CommonConvertUtils.where2Example(where, OKErrorSetsModelExample.class, OKErrorSetsModel.class);
		Integer count = okErrorSetsModelDao.countByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView delete(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		OKErrorSetsModelExample example = (OKErrorSetsModelExample) CommonConvertUtils.where2Example(where, OKErrorSetsModelExample.class, OKErrorSetsModel.class);
		Integer count = okErrorSetsModelDao.deleteByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView select(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		OKErrorSetsModelExample example = (OKErrorSetsModelExample) CommonConvertUtils.where2Example(where, OKErrorSetsModelExample.class, OKErrorSetsModel.class);
		if (params.getOrderBy() != null && !params.getOrderBy().isEmpty()) {
			example.setOrderByClause(params.getOrderBy());
		}
		List<OKErrorSetsModel> rows = okErrorSetsModelDao.selectByExample(example);
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
		OKErrorSetsModel record = (OKErrorSetsModel) CommonConvertUtils.set2Model(set, OKErrorSetsModel.class);
		SQLWhere where = params.getWhere();
		OKErrorSetsModelExample example = (OKErrorSetsModelExample) CommonConvertUtils.where2Example(where, OKErrorSetsModelExample.class, OKErrorSetsModel.class);
		Integer count = okErrorSetsModelDao.updateByExampleSelective(record, example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}
}
