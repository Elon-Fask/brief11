package com.springboot.brief11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class Controller {
	
	@RequestMapping("/hello")
	@ResponseBody
	
	public String hello() {
		return "hello";
	}
	

}
