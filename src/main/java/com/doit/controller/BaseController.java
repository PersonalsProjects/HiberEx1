package com.doit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BaseController {

	private static int counter = 0;
	private static final String VIEW_INDEX = "index";
	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome(ModelMap modelMap){	
		modelMap.addAttribute("counter", ++counter);
		modelMap.addAttribute("message","Welcome to Spring-MVC test application");
		logger.debug("[welcome] counter : {}", counter);
		return VIEW_INDEX;
	}
}
