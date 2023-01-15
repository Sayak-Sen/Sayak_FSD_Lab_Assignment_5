package com.greatlearning.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomePageController {
@RequestMapping("/welcome")
	public String Welcome() {
	 return "Welcome-Page";
 }
}
