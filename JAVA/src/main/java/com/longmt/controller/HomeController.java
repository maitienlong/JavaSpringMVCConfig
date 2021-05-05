package com.longmt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/trang-chu")
	public String sayHello(ModelMap map) {
		map.addAttribute("msg", "Mai Tien Long");
		return "homepage";
	}

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	
}
