package com.osfg.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.osfg.models.Properties;

/**
 * 
 * @author athakur
 * Test controller
 */
@Controller
public class TestController {
	
	@Autowired
	Properties properties;
	
	
	Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping(value="/test/{data}",method=RequestMethod.GET)
	public String test(@PathVariable String data, ModelMap model,
			HttpServletRequest request, HttpServletResponse response) {
		logger.debug("Received request for test controller with data : {}", data);
		model.put("adminName", properties.getAdminName());
		//Path variables are automatically added to Model (Spring 3.1+)
		//model.put("data", data);
		return "test";
		
	}
	
	
}
