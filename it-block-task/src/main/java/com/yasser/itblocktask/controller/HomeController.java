package com.yasser.itblocktask.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
		@RequestMapping("/")
		private ModelAndView home() {
			return new ModelAndView("index.html");
		}
		
		@RequestMapping("/statistics")
		private ModelAndView statistics() {
			return new ModelAndView("statistics.html");
		}
		
		@RequestMapping("/addEmployee")
		private ModelAndView employee() {
			return new ModelAndView("employee.html");
		}

}
