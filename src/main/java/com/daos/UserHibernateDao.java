package com.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojos.User;

public class UserHibernateDao 
{
	public String loginUser(User user)
	{
		System.out.println("Entered saveUser :: UserDao");
		try {
			Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
			SessionFactory sessionFactory=configuration.buildSessionFactory();
			Session session=sessionFactory.openSession();
			System.out.println("trying to save!!");
			session.save(user);
			session.beginTransaction().commit();
			System.out.println("Done!!");
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Exiting from saveUser :: UserDao");
		//Database logic
		return "login";
		
	}
	
	
}
