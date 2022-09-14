package com.summer.DojosAndNinjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.summer.DojosAndNinjas.models.Dojo;
import com.summer.DojosAndNinjas.models.Ninja;
import com.summer.DojosAndNinjas.services.DojoService;
import com.summer.DojosAndNinjas.services.NinjaService;

@Controller
public class MainController {
	@Autowired
	private NinjaService ninjas;
	@Autowired 
	private DojoService dojos;
	
	@GetMapping("/dojos/new") //get for new dojo.
	public String newDojoForm(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	@PostMapping("/dojos") // Post for created dojo, consulted stackoverflow and watched the solution video for help resolving errors around this one.
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		
		Dojo newDojo = dojos.create(dojo);
		return String.format("redirect:/dojos/%s",newDojo.getId());
	}
	@GetMapping("/ninjas/new") //get and post for new ninja.
	public String newNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojos.all());
		return "newNinja.jsp";
	}
	@PostMapping("/ninjas") //Post created ninjas in a table
	public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninja = ninjas.create(ninja);
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
	@GetMapping("/dojos/{id}")//show dojo + ninjas list
	public String showDojo(@PathVariable("id") Long id, Model model) {
		System.out.printf("dojo id from url: %s",id);
		Dojo dojo = dojos.find(id);
		model.addAttribute("dojo", dojo);
		return "show.jsp";
	}
}
