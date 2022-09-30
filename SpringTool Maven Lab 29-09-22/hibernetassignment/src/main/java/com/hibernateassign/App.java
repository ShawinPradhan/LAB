package com.hibernateassign;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session= factory.openSession();
        Transaction tx=session.beginTransaction();
        
//        Brand brand1 = new Brand();
//	     brand1.setBid(111);
//	     brand1.setName("Adidas");
//	     
//	     Brand brand2 = new Brand();
//	     brand2.setBid(112);
//	     brand2.setName("Levi's");
//	     
//	     Category cat1 = new Category();
//	     cat1.setcName("Jump Suit");
//	     cat1.setnItems(1000);
//	     cat1.setBrand(brand1);
//	     
//	     Category cat2 = new Category();
//	     cat2.setcName("Shoes");
//	     cat2.setnItems(500);
//	     cat2.setBrand(brand1);
//	     
//	     Category cat3 = new Category();
//	     cat3.setcName("Jeans");
//	     cat3.setnItems(400);
//	     cat3.setBrand(brand2);
//	     
//	     Category cat4 = new Category();
//	     cat4.setcName("Jackets");
//	     cat4.setnItems(800);
//	     cat4.setBrand(brand2);
//	     
//	     List<Category> category1 = new ArrayList<Category>();
//	     category1.add(cat1);
//	     category1.add(cat2);
//	     category1.add(cat3);
//	     category1.add(cat4);
//	     
//	     brand1.setCategory(category1);
//	     brand2.setCategory(category1);
//	     
//	     session.save(brand1);
//	     session.save(brand2);
//	     tx.commit();
        
        Operation operation=new Operation();
        do {
        	operation.mainMenu();
        	
        }while(true);
       
        
	     //session.close();
	     //factory.close();
    }
}
