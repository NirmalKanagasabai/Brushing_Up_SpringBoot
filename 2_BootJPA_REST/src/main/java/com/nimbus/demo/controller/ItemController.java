package com.nimbus.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
//	
//	@RequestMapping("/getItem")
//	public ModelAndView addItem(@RequestParam int itemID) {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("showItem.jsp");
//		
//		System.out.println(itemRepo.findByItemCompany("Samsung"));
//		System.out.println(itemRepo.findByItemPriceGreaterThan(600));
//		System.out.println(itemRepo.findByItemCategorySorted("Smartphones"));
//		
//		Item item = itemRepo.findById(itemID).orElse(new Item());
//		mv.addObject(item);
//		
//		return mv;
//	}
	
	@RequestMapping("/items") 
	@ResponseBody
	public List<Item> getItems() {
		
		return itemRepo.findAll();
	}
	
	@RequestMapping("/item/{itemID}") 
	@ResponseBody
	public Optional<Item> getItem(@PathVariable("itemID") int itemID) {
		
		return itemRepo.findById(itemID);
	}
}
