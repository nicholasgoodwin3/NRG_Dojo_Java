package com.summer.FruityLoops.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.summer.FruityLoops.Models.FruitList;

@Controller
public class FruitController {
	@RequestMapping("/")
    public String index(Model model) {
        
        ArrayList<FruitList> fruits = new ArrayList<FruitList>();
        fruits.add(new FruitList("Kiwi", 1.5));
        fruits.add(new FruitList("Mango", 2.0));
        fruits.add(new FruitList("Goji Berries", 4.0));
        fruits.add(new FruitList("Guava", .75));
        
        // Add fruits your view model here
        model.addAttribute("fruits", fruits);
        
        return "Index.jsp"; //produces the correct info, and calls Index.jsp successfully!
    }
}
