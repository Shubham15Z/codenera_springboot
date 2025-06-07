package com.sz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sz.model.User;

@Controller
public class HomeController 
{
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login.jsp";
	}
	
	@PostMapping("/submitform")
	public String login1(@RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("email") String email)
	{
		System.out.println("Name : "+name);
		System.out.println("Password : "+password);
		System.out.println("Email : "+email);
		return "result.jsp";
	}
	
	@PostMapping("/userform")
	public String loginDetails(@ModelAttribute User e1)
	{
		System.out.println(e1);
		return "result.jsp";
	}
	
}
