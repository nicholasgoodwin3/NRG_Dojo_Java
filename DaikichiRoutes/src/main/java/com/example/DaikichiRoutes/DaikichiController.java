package com.example.DaikichiRoutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String daikichi() {
		return "welcome!";
	}
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping("/tomorrow")
	public String tommorrow() {
		return "Tomorrow an oppurtunity will arise, so be sure to be open to new ideas!!!";
	}
}
