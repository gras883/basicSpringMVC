package com.MVCdemo3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//parent mapping - In case of ambiguity where two different class method have same RequestMapping
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller to show the HTML form
	@RequestMapping("/showForm")
	public String showFrom() {
		return "helloworld-form";
	}
	
	// need a controller to process the HTML Form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// use model to pass the data to HTML form 
	@RequestMapping("/processForm2")
	public String prcessFrom2(HttpServletRequest request ,Model model) {
		// read the request parameter
		String thename = request.getParameter("studentName");
		
		// Change the character to upper case
		thename = thename.toUpperCase();
		
		// create the string we wanna to pass
		String result = "Yo! " + thename;
		
		// add to the model
		model.addAttribute("message", result);
		
		// return the jsp page
		return "helloworld";
		
	}
	
	// bind the parameter here from the HTML request
	@RequestMapping("/processForm3")
	public String prcessFromVersion3(@RequestParam("studentName") String thename ,Model model) {
		
		// Change the character to upper case
		thename = thename.toUpperCase();
			
		// create the string we wanna to pass
		String result = "Hello Bro from 3 ! " + thename;
			
		// add to the model
		model.addAttribute("message", result);
			
		// return the jsp page
		return "helloworld";
			
	}
	
}
