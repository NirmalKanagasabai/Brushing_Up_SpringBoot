package com.nimbus.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}

}
