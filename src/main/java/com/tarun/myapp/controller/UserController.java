package com.tarun.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tarun.myapp.repo.UserRepository;



@Controller
public class UserController {

	@Autowired	
	UserRepository personDao;
	
	@RequestMapping(value= "/", method=RequestMethod.GET)
	public ModelAndView hello()
	{
		
		return new ModelAndView("index");
		
	}
	@RequestMapping(value= "/greeting", method=RequestMethod.GET)
	public ModelAndView getPersonList()//(@RequestParam(value="name",defaultValue="Hello") String fname)
	{
		
		return new ModelAndView("user").addObject("persons",personDao.findAll());
		
	}
}
