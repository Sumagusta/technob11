package com.kodehive.technob11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MahasiswaController {
	
	@RequestMapping("/view")
	public String view() {
		return "/home";
	}
	
}
