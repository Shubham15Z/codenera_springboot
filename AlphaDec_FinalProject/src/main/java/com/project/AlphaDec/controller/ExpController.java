package com.project.AlphaDec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.AlphaDec.model.Experience;
import com.project.AlphaDec.repository.ExpRepo;

@Controller
public class ExpController 
{
	@Autowired
	public ExpRepo exprepo;
	
	@PostMapping("/addexp")
	public String addExp(@ModelAttribute Experience exp)
	{
		System.out.println(exp);
		exprepo.save(exp);
		return "demo.jsp";
	}
	
	@RequestMapping("/datafetch")
	public String datafetch(Model m)
	{
		List<Experience> exp_li = exprepo.findAll();
		System.out.println(exp_li);
		m.addAttribute("exp_data_li", exp_li);
		return "datafetch.jsp";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		exprepo.deleteById(id);
		return "redirect:/datafetch";
	}
	
	@RequestMapping("/{id}")
	public String edit(@PathVariable int id, Model m)
	{
		Experience ob = exprepo.findById(id).orElse(null);
		m.addAttribute("edit_data", ob);
		return "edit.jsp";
	}
	
	@RequestMapping("/edit/{id}")
	public String update(@PathVariable int id, @ModelAttribute Experience ob)
	{
		Experience eob = exprepo.findById(id).orElse(null);
		if(eob != null)
		{
			eob.setCompanyName(ob.getCompanyName());
			eob.setRole(ob.getRole());
			eob.setDateOfJoining(ob.getDateOfJoining());
			eob.setLastDate(ob.getLastDate());
		}
		exprepo.save(eob);
		return "redirect:/datafetch";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
