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
import com.emg.datamanage.dao.errorlog.MaskIteminfoModelDao;
import com.emg.datamanage.pojo.MaskIteminfoModel;
import com.emg.datamanage.pojo.MaskIteminfoModelExample;

@Service
public class MaskIteminfoModelService {
	@Autowired
	private MaskIteminfoModelDao maskIteminfoModelDao;

	public ModelAndView insert(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLSet set = params.getSet();
		if(set.isEmpty()) {
			json.addObject("status", false);
			json.addObject("option", "set is empty");
			return json;
		}
		MaskIteminfoModel record = (MaskIteminfoModel) CommonConvertUtils.set2Model(set, MaskIteminfoModel.class);
		Integer count = maskIteminfoModelDao.insertSelective(record);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView count(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		MaskIteminfoModelExample example = (MaskIteminfoModelExample) CommonConvertUtils.where2Example(where, MaskIteminfoModelExample.class, MaskIteminfoModel.class);
		Integer count = maskIteminfoModelDao.countByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView delete(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		MaskIteminfoModelExample example = (MaskIteminfoModelExample) CommonConvertUtils.where2Example(where, MaskIteminfoModelExample.class, MaskIteminfoModel.class);
		Integer count = maskIteminfoModelDao.deleteByExample(example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}

	public ModelAndView select(RequestModule params) throws Exception {
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		SQLWhere where = params.getWhere();
		MaskIteminfoModelExample example = (MaskIteminfoModelExample) CommonConvertUtils.where2Example(where, MaskIteminfoModelExample.class, MaskIteminfoModel.class);
		if (params.getOrderBy() != null && !params.getOrderBy().isEmpty()) {
			example.setOrderByClause(params.getOrderBy());
		}
		List<MaskIteminfoModel> rows = maskIteminfoModelDao.selectByExample(example);
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
		MaskIteminfoModel record = (MaskIteminfoModel) CommonConvertUtils.set2Model(set, MaskIteminfoModel.class);
		SQLWhere where = params.getWhere();
		MaskIteminfoModelExample example = (MaskIteminfoModelExample) CommonConvertUtils.where2Example(where, MaskIteminfoModelExample.class, MaskIteminfoModel.class);
		Integer count = maskIteminfoModelDao.updateByExampleSelective(record, example);
		json.addObject("status", true);
		json.addObject("option", count);
		return json;
	}
}
