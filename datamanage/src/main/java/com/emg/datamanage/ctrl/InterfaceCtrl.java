package com.emg.datamanage.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.emg.datamanage.bean.RequestModule;
import com.emg.datamanage.bean.OperateType;
import com.emg.datamanage.bean.TableEnum;
import com.emg.datamanage.service.ErrorModelService;
import com.emg.datamanage.service.ErrorRelatedModelService;
import com.emg.datamanage.service.ErrorStatisticsModelService;
import com.emg.datamanage.service.MaskIteminfoModelService;
import com.emg.datamanage.service.MaxidModelService;
import com.emg.datamanage.service.OKErrorIteminfoModelService;
import com.emg.datamanage.service.OKErrorSetsModelService;
import com.emg.datamanage.service.OKErrorSetsRelatedModelService;

@Controller
@RequestMapping("/interface.web")
public class InterfaceCtrl {
	private static final Logger logger = LoggerFactory.getLogger(InterfaceCtrl.class);

	@Autowired
	private MaxidModelService maxidModelService;
	@Autowired
	private ErrorModelService errorModelService;
	@Autowired
	private ErrorRelatedModelService errorRelatedModelService;
	@Autowired
	private ErrorStatisticsModelService errorStatisticsModelService;
	@Autowired
	private MaskIteminfoModelService maskIteminfoModelService;
	@Autowired
	private OKErrorIteminfoModelService okErrorIteminfoModelService;
	@Autowired
	private OKErrorSetsModelService okErrorSetsModelService;
	@Autowired
	private OKErrorSetsRelatedModelService okErrorSetsRelatedModelService;
	
	@RequestMapping()
	public String openLader(Model model, HttpServletRequest request, HttpSession session) {
		logger.debug("InterfaceCtrl-openLader start.");
		
		return "interface";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView controller(Model model, HttpSession session,
			HttpServletRequest request, 
			@RequestParam("table") TableEnum table,
			@RequestParam("type") OperateType type,
			@RequestParam("params") RequestModule params) {
		logger.debug("controller-" + table + "-" + type + " start.");
		ModelAndView json = new ModelAndView(new MappingJackson2JsonView());
		try {
			if(table == null) {
				json.addObject("status", false);
				json.addObject("option", "table can not be null");
				logger.debug("controller-" + table + "-" + type + " end.");
				return json;
			}
			if(type == null) {
				json.addObject("status", false);
				json.addObject("option", "type can not be null");
				logger.debug("controller-" + table + "-" + type + " end.");
				return json;
			}
			switch (table) {
			case TB_ERROR:
				switch (type) {
				case INSERT:
					json = errorModelService.insert(params);
					break;
				case COUNT:
					json = errorModelService.count(params);
					break;
				case DELETE:
					json = errorModelService.delete(params);
					break;
				case SELECT:
					json = errorModelService.select(params);
					break;
				case UPDATE:
					json = errorModelService.update(params);
					break;
				default:
					json.addObject("status", false);
					json.addObject("option", "unknow type: " + type);
					break;
				}
				break;
			case MAXID:
				switch (type) {
				case INSERT:
					json = maxidModelService.insert(params);
					break;
				case COUNT:
					json = maxidModelService.count(params);
					break;
				case DELETE:
					json = maxidModelService.delete(params);
					break;
				case SELECT:
					json = maxidModelService.select(params);
					break;
				case UPDATE:
					json = maxidModelService.update(params);
					break;
				default:
					json.addObject("status", false);
					json.addObject("option", "unknow type: " + type);
					break;
				}
				break;
			case TB_ERROR_RELATED:
				switch (type) {
				case INSERT:
					json = errorRelatedModelService.insert(params);
					break;
				case COUNT:
					json = errorRelatedModelService.count(params);
					break;
				case DELETE:
					json = errorRelatedModelService.delete(params);
					break;
				case SELECT:
					json = errorRelatedModelService.select(params);
					break;
				case UPDATE:
					json = errorRelatedModelService.update(params);
					break;
				default:
					json.addObject("status", false);
					json.addObject("option", "unknow type: " + type);
					break;
				}
				break;
			case TB_ERROR_STATISTICS:
				switch (type) {
				case INSERT:
					json = errorStatisticsModelService.insert(params);
					break;
				case COUNT:
					json = errorStatisticsModelService.count(params);
					break;
				case DELETE:
					json = errorStatisticsModelService.delete(params);
					break;
				case SELECT:
					json = errorStatisticsModelService.select(params);
					break;
				case UPDATE:
					json = errorStatisticsModelService.update(params);
					break;
				default:
					json.addObject("status", false);
					json.addObject("option", "unknow type: " + type);
					break;
				}
				break;
			case TB_MASK_ITEMINFO:
				switch (type) {
				case INSERT:
					json = maskIteminfoModelService.insert(params);
					break;
				case COUNT:
					json = maskIteminfoModelService.count(params);
					break;
				case DELETE:
					json = maskIteminfoModelService.delete(params);
					break;
				case SELECT:
					json = maskIteminfoModelService.select(params);
					break;
				case UPDATE:
					json = maskIteminfoModelService.update(params);
					break;
				default:
					json.addObject("status", false);
					json.addObject("option", "unknow type: " + type);
					break;
				}
				break;
			case TB_OKERROR_ITEMINFO:
				switch (type) {
				case INSERT:
					json = okErrorIteminfoModelService.insert(params);
					break;
				case COUNT:
					json = okErrorIteminfoModelService.count(params);
					break;
				case DELETE:
					json = okErrorIteminfoModelService.delete(params);
					break;
				case SELECT:
					json = okErrorIteminfoModelService.select(params);
					break;
				case UPDATE:
					json = okErrorIteminfoModelService.update(params);
					break;
				default:
					json.addObject("status", false);
					json.addObject("option", "unknow type: " + type);
					break;
				}
				break;
			case TB_OKERRORSETS:
				switch (type) {
				case INSERT:
					json = okErrorSetsModelService.insert(params);
					break;
				case COUNT:
					json = okErrorSetsModelService.count(params);
					break;
				case DELETE:
					json = okErrorSetsModelService.delete(params);
					break;
				case SELECT:
					json = okErrorSetsModelService.select(params);
					break;
				case UPDATE:
					json = okErrorSetsModelService.update(params);
					break;
				default:
					json.addObject("status", false);
					json.addObject("option", "unknow type: " + type);
					break;
				}
				break;
			case TB_OKERRORSETS_RELATEDITEM:
				switch (type) {
				case INSERT:
					json = okErrorSetsRelatedModelService.insert(params);
					break;
				case COUNT:
					json = okErrorSetsRelatedModelService.count(params);
					break;
				case DELETE:
					json = okErrorSetsRelatedModelService.delete(params);
					break;
				case SELECT:
					json = okErrorSetsRelatedModelService.select(params);
					break;
				case UPDATE:
					json = okErrorSetsRelatedModelService.update(params);
					break;
				default:
					json.addObject("status", false);
					json.addObject("option", "unknow type: " + type);
					break;
				}
				break;
			default:
				json.addObject("status", false);
				json.addObject("option", "unknow table: " + table);
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
			json.addObject("status", false);
			json.addObject("option", e.getMessage());
		}
		logger.debug("controller-" + table + "-" + type + " end.");
		return json;
	}

}
