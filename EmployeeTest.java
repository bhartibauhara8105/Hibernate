package com.niit.hiber;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Configuration cfg=new Configuration();
		  cfg.configure("hibernate.cfg.xml");
		  SessionFactory sf=cfg.buildSessionFactory();
		  Session session=sf.openSession();
		  Transaction t=session.beginTransaction();
		  
		  Employee e1=new Employee();
		  e1.setId(102);
		  e1.setFirstName("Anamika");
		  e1.setLastName("Das");
		  e1.setSalary(40000);
		  
		  session.save(e1);
		  t.commit();
		  System.out.println("Successfully Saved");
		  session.close();
		  sf.close();
	}

}
