package com.cd.dashboard.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cd.dashboard.service.IDashboardService;

@Controller
public class DashboardController {
	
	@Autowired
	private IDashboardService dashboardService;
	
	@RequestMapping("/")
	public ModelAndView dashboard() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("dashboard");
		
		Set<String> processedPhotos = dashboardService.getProcessedPhotos();
		Set<String> unprocessedPhotos = dashboardService.getUnprocessedPhotos();
		Set<String> exceptions = dashboardService.getExceptions();
		
		modelAndView.addObject("processedPhotos", processedPhotos);
		modelAndView.addObject("unprocessedPhotos", unprocessedPhotos);
		modelAndView.addObject("exceptions", exceptions);
		
		return modelAndView;
	}

}
