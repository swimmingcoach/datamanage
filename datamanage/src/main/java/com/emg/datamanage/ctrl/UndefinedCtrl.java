package com.emg.datamanage.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/undefined.web")
public class UndefinedCtrl {
	private static final Logger logger = LoggerFactory.getLogger(UndefinedCtrl.class);

	@RequestMapping()
	public String openLader(Model model, HttpServletRequest request, HttpSession session) {
		logger.debug("UndefinedCtrl-openLader start.");
		
		return "undefined";
	}

}
