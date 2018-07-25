package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojos.User;
import com.services.UserService;

@Controller
public class UserController
{
	@RequestMapping(value = "/register")
	public String saveUser(User user)
	{
		return "registration";
			
	}
	@RequestMapping(value = "/login")
	public String loginUser(User user)
	{
		UserService us = new UserService();
		String result = us.loginUser(user);
		System.out.println("exiting form saveUser :: UserController");

		return"login";
	}

}
