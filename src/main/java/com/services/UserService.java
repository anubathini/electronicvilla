package com.services;

import com.daos.UserHibernateDao;
import com.pojos.User;

public class UserService 
{
	public String loginUser(User user)
	{
		System.out.println(user.getUserName());
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getMailId());
		System.out.println(user.getMobileNo());
		System.out.println(user.getPassword());

		UserHibernateDao uhd = new UserHibernateDao();
		String result = uhd.loginUser(user);
		return "result";
	}
}
