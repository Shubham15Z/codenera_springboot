package com.project.AlphaDec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.AlphaDec.model.Employee;
import com.project.AlphaDec.repository.EmpRepo;

@Controller
public class EmpController 
{
	@Autowired
	public EmpRepo emprepo;
	
	@GetMapping("/")
	public String register()
	{
		return "register.jsp";
	}
	
	@PostMapping("/registration")
	public String reg(@ModelAttribute Employee emp)
	{
		emprepo.save(emp);
		System.out.println(emp);
		return "login.jsp";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password)
	{
		Employee e1 = emprepo.findByEmail(email);
		
		if(e1 != null && e1.getEmail().equalsIgnoreCase(email) && e1.getPassword().equals(password))
		{
			return "welcome.jsp";
		}
		else
		{
			return "login.jsp";
		}
		
	}
}