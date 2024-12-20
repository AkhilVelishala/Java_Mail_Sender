package com.SpringBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Service.JavaMailSenderService;

@RestController
public class SpringController {

	@Autowired 
	private JavaMailSenderService service;
	
	
	@GetMapping("/sending")
	
	public String Sending()
	{
		
		service.SendingMail("karanamsaideepak@gmail.com", 
				"mendix ", "infinitudeIT solutions");
		return "mail sended successfully";
	}
	
	
}
