package com.niit.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {
	public static void main(String [] args)
	{
		
		  Configuration cfg=new Configuration();
		  cfg.configure("hibernate.cfg.xml");
		  SessionFactory sf=cfg.buildSessionFactory();
		  Session session=sf.openSession();
		  Transaction t=session.beginTransaction();
		User u=new User();
		u.setName("Bharti");
		u.setPassword("123@");
		u.setEmail("bh@gmail.com");
		
		  session.save(u);
		  t.commit();
		  System.out.println("Successfully Saved");
		  session.close();
		  sf.close();
	}

}
