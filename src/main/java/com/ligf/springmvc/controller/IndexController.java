package com.ligf.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value="/index")
	public ModelAndView index(ModelAndView modelAndView) {
		System.out.println("#### IndexController");
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
