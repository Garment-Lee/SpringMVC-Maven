package com.ligf.springmvc.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ligf.springmvc.domain.User;
import com.ligf.springmvc.service.UserService;

@Controller
public class UserController {
	
	Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/user/getAllUser")
	public ModelAndView getAllUser(ModelAndView modelAndView) {
		List<User> users = userService.selectAllUser();
		logger.debug("#### UserController getAllUser users:" + users);
		return modelAndView;
	}

}
