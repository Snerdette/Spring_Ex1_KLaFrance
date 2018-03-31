package com.catalyst.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "/home.html";
	}
	
	@RequestMapping(value = "/about-us", method = RequestMethod.GET)
	public String about() {
		return "/about.html";
	}
	
	@RequestMapping(value = "/employee/index", method = RequestMethod.GET)
	public String employee() {
		return "/employee-index.html";
	}
	
	@RequestMapping(value = "/employee/update", method = RequestMethod.GET)
	public String update() {
		return "/employee-update.html";
	}
	
	@RequestMapping(value = "/employee/create", method = RequestMethod.GET)
	public String create() {
		return "/employee-create.html";
	}
	
	@RequestMapping(value = "/employee/delete", method = RequestMethod.GET)
	public String delete() {
		return "/employee-delete.html";
	}
}
