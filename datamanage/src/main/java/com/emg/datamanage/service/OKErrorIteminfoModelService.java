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
import com.emg.datamanage.dao.okresults.OKErrorIteminfoModelDao;
import com.emg.datamanage.pojo.OKErrorIteminfoModel;
import com.emg.datamanage.pojo.OKErrorIteminfoModelExample;

@Service
public class OKErrorIteminfoModelService {
	@Autowired
	private OKErrorIteminfoModelDao okErrorIteminfoModelDao;

	public ModelAndView insert(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLSet set = params.getSet();
		if(set.isEmpty()) {
			json.addObject("status", false);
			json.addObject("option", "set is empty");
			return json;
		}
		OKErrorIteminfoModel record = (OKErrorIteminfoModel) CommonConvertUtils.set2Model(set, OKErrorIteminfoModel.class);
		Integer count = okErrorIteminfoModelDao.insertSelective(record);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView count(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		OKErrorIteminfoModelExample example = (OKErrorIteminfoModelExample) CommonConvertUtils.where2Example(where, OKErrorIteminfoModelExample.class, OKErrorIteminfoModel.class);
		Integer count = okErrorIteminfoModelDao.countByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView delete(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		OKErrorIteminfoModelExample example = (OKErrorIteminfoModelExample) CommonConvertUtils.where2Example(where, OKErrorIteminfoModelExample.class, OKErrorIteminfoModel.class);
		Integer count = okErrorIteminfoModelDao.deleteByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView select(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		OKErrorIteminfoModelExample example = (OKErrorIteminfoModelExample) CommonConvertUtils.where2Example(where, OKErrorIteminfoModelExample.class, OKErrorIteminfoModel.class);
		if (params.getOrderBy() != null && !params.getOrderBy().isEmpty()) {
			example.setOrderByClause(params.getOrderBy());
		}
		List<OKErrorIteminfoModel> rows = okErrorIteminfoModelDao.selectByExample(example);
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
		OKErrorIteminfoModel record = (OKErrorIteminfoModel) CommonConvertUtils.set2Model(set, OKErrorIteminfoModel.class);
		SQLWhere where = params.getWhere();
		OKErrorIteminfoModelExample example = (OKErrorIteminfoModelExample) CommonConvertUtils.where2Example(where, OKErrorIteminfoModelExample.class, OKErrorIteminfoModel.class);
		Integer count = okErrorIteminfoModelDao.updateByExampleSelective(record, example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}
}
