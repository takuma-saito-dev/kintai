package com.example.demodemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/kintai")
	private String kintai() {
		return "/register.html";
	}
	
	@RequestMapping(value = "/list")
	private String list() {
		return "/kintai_List.html";
	}
	
}