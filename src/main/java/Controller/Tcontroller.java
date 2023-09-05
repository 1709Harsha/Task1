package com.Task.Task1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Task.Task1.dto.Tdto;
import com.Task.Task1.service.Tservice;

import ch.qos.logback.core.model.Model;

@Controller

public class Tcontroller {
	
	@Autowired
	private Tservice service;
	
	
	@GetMapping("/yoo")
    public List<Tdto>  viewHomepage(Model model)
    {
    	List<Tdto> dt= service.getAllTdto();
    	return dt;
    }
	
	
	@GetMapping("/fetchById")
	public Tdto viewById(@PathVariable int no)
{
		Tdto dt=service.getItemById(no);
				return dt;
}

	@PostMapping("/save")
	public String viewById(@ModelAttribute Tdto dt)
	{
	 service.saveItem(dt);
	 return "yaa";
	}
	
	@GetMapping("Delete/id")
	public String deleteById(@PathVariable int no)
	{
		service.deleteItem(no);
		return "redirect/";
	}
}
	
	
	
