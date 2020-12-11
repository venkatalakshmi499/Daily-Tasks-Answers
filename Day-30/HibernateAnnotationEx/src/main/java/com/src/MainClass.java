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
		c.setEmailid("abc@bbc.com"); */
		
		/*Customer c1=new Customer();
		c1.setCid(500);
		c1.setCname("rani");
		c1.setCadd("vizag");
		c1.setEmailid("gghc@bbc.com");*/
		

		Customer c2=new Customer();
		c2.setCid(410);
		c2.setCname("venky");
		c2.setCadd("vizag");
		c2.setEmailid("gghc@mmc.com");
		
		//session.save(c);
		//session.save(c1);
		session.save(c2);
		t.commit();
		session.close();
		factory.close();
		System.out.println("values inserted");
	}

}
