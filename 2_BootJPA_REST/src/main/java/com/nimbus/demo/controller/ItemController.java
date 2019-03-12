package com.nimbus.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nimbus.demo.itemRepo.ItemRepo;
import com.nimbus.demo.model.Item;

@Controller
public class ItemController {
	
	@Autowired
	ItemRepo itemRepo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addItem")
	public String addItem(Item item) {
		
		itemRepo.save(item);
		return "home.jsp";
	}
	
	@RequestMapping("/getItem")
	public ModelAndView addItem(@RequestParam int itemID) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("showItem.jsp");
		
		Item item = itemRepo.findById(itemID).orElse(new Item());
		mv.addObject(item);
		
		return mv;
	}
}