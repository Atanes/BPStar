package com.bpstar.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String inicio() {
		return "inicio";
	}
	
	@RequestMapping("/teste")
	public String teste() {
		return "teste";
	}
}
