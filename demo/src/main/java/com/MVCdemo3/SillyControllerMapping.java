package com.MVCdemo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyControllerMapping {
	
	@RequestMapping("/showForm")
	public String showformSilly() {
		return "helloworld-form";
	}

}
