package com.src;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		/*Customer c=new Customer();
		c.setCid(499);
		c.setCname("roja");
		c.setCadd("vzm");
		c.setEmailid("abc@bbc.com"); 
		
		Customer c1=new Customer();
		c1.setCid(500);
		c1.setCname("rani");
		c1.setCadd("vizag");
		c1.setEmailid("gghc@bbc.com"); */
		
		Customer c2=new Customer();
		c2.setCid(300);
		c2.setCname("vanaja");
		c2.setCadd("vizag");
		c2.setEmailid("asdjb@bbc.com"); 
		
		Customer c3=new Customer();
		c3.setCid(308);
		c3.setCname("krish");
		c3.setCadd("vzm");
		c3.setEmailid("asdjb@gmail.com"); 
		
		//session.save(c);
		//session.save(c1);
		//int a=(Integer) session.save(c1);
		//System.out.println(a);
		session.update(c2);
	    session.delete(c2);
	    session.persist(c3);
	    session.merge(c3);
	    
		t.commit();
		session.close();
		factory.close();
		System.out.println("values inserted");
	}

}
