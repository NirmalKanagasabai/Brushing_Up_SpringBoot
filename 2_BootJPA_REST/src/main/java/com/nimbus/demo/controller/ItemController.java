package com.nimbus.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimbus.demo.itemRepo.ItemRepo;
import com.nimbus.demo.model.Item;

@RestController
public class ItemController {
	
	@Autowired
	ItemRepo itemRepo;
	
//	@RequestMapping("/")
//	public String home() {
//		return "home.jsp";
//	}
	
	@PostMapping("/newItem")
	public void addItem(Item item) {
		
		itemRepo.save(item);
	}
	
	@DeleteMapping("/deleteItem/{itemID}")
	public String deleteAlien(@PathVariable int itemID) {
		Item item = itemRepo.getOne(itemID);
		
		itemRepo.delete(item);
		
		return "deleted";
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
	
	@GetMapping("/items") 
	public List<Item> getItems() {
		
		return itemRepo.findAll();
	}
	
	@GetMapping("/item/{itemID}") 
	public Optional<Item> getItem(@PathVariable("itemID") int itemID) {
		
		return itemRepo.findById(itemID);
	}
	
	
}
