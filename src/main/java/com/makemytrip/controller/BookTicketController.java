package com.makemytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.makemytrip.binding.Passanger;
import com.makemytrip.binding.Tickect;
import com.makemytrip.service.MakeMyTripService;

@Controller
public class BookTicketController {

	
	       @Autowired
	       private MakeMyTripService makeMyTripService;
	       @GetMapping("/")
	       public String getAllTickets(Model model) {
	    	   
	    	   List<Tickect> allTickest = makeMyTripService.getAllTickest();
	    	   
	    	   model.addAttribute("list", allTickest);
	    	   
	    	   return "index";
	       }
	       @GetMapping("/load")
	       public String loadBookmyTickect(Model model) {
	    	         model.addAttribute("msg", new Passanger());
	    	         
	    	     return "bookticket";
	       }
	       @PostMapping("/book")
	       public String bookmyTickect(Passanger t,Model model) {
	    	   makeMyTripService.bookMyTickect(t);
	    	   model.addAttribute("msg","tickect sucessfully saved"); 
	    	     return "redirect:/";
	       }
}
