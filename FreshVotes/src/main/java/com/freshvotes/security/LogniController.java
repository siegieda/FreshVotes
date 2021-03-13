package com.freshvotes.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogniController {

	//@RequestMapping(value="/login", method=RequestMethod.GET)
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
