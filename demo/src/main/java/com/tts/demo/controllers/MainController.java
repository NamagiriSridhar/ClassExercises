package com.tts.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
	@RequestMapping("/")
	public String step1() 
	{
		return "Bootcamp in progress";
	}
	@RequestMapping("/tothefuture/job")
	public String step2() 
	{
		return "Step 1 accomplished";
	}
	@RequestMapping("/tothefuture/home")
	public String step3() 
	{
		return "Safe & loving Home where D and me will thrive is ready :)";
	}
	@RequestMapping("/tothefuture/love")
	public String step4() 
	{
		return "reach out and ask. If he asks before that will be thrilling";
	}
}
