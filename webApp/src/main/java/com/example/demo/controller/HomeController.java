package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
//	public String home(HttpServletRequest req) {
//		
//		HttpSession httpSession = req.getSession();
//		
//		String name = req.getParameter("name");
//		System.out.println("Hello " + name);
//		
//		httpSession.setAttribute("name", name);
//		
//		return "home";
//	}
	
	
	/*
	 * Not making use of HttpServletRequest
	 * Not getting the session from the requestObject
	 * Replacing the String return type to ModelAndView
	 */
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("id") int itemID, @RequestParam("name") String itemName, 
			@RequestParam("company") String itemCompany, @RequestParam("category") String itemCategory,
			@RequestParam("price") long itemPrice) { 
		
		ModelAndView mv = new ModelAndView();
		
		// Set the model 
		mv.addObject("id", itemID);
		mv.addObject("name", itemName);
		mv.addObject("company", itemCompany);
		mv.addObject("category", itemCategory);
		mv.addObject("price", itemPrice);
		
		// Set the view (where it should be displayed)
		mv.setViewName("home");
		
		return mv;
	}
	
	
	// Request: localhost:8080/home?id=1&name=Deck&company=Motorola&category=Speakers&price=400

	/*
	 * Response:
	 * 
	 * ID: 1
	 * Name: Deck
	 * Company: Motorola
	 * Category: Speakers
	 * Price: 400
	 */

}
