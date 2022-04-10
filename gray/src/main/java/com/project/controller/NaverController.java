package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.service.NaverService;


@Controller
public class NaverController {
	
	@Autowired
	private NaverService naverService;
	

	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		
		int result = naverService.insert();
		
		return "join";
	}

}
