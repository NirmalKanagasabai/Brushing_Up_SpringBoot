package com.nimbus.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nimbus.demo.dao.ItemRepo;
import com.nimbus.demo.model.Item;

@Controller
public class ItemController {
	
	@Autowired
	ItemRepo itemRepo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addItem")
	public String addItem(Item item) {
		
		itemRepo.save(item);
		return "home";
	}

}
