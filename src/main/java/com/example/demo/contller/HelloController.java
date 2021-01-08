package com.example.demo.contller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String index() {
		
		return "form";
	}
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(required = false) String message, Model model) {
		
		model.addAttribute("sample", message);
		return "hello";
	}
	
	@PostMapping("/confirm")
	public String comfirm(@RequestParam String message, Model model) {
		model.addAttribute("message", message);
		return "confirm";
	}
}
