package com.niit.hibernatejava;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.niit.hibernatejava.model.Department;
import com.niit.hibernatejava.model.Employee;

public class App 
{
 public static void main( String[] args )
    {
	 
		SessionFactory sessionFactory = HBConfig.createSessionFactory();
		Employee e = new Employee();
		
		e.setEmpname("vinodhini");
		e.setEmpdesig("Manager");
		e.setEmpdept("HR");
		
		Department e1 = new Department();
		e1.setDeptname("vino");
		
		Session s=sessionFactory.openSession();
		Transaction txt=s.beginTransaction();
		s.save(e);
		s.save(e1);
		txt.commit();
		s.close();
	}}