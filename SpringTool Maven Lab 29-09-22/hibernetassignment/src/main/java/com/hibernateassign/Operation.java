package com.hibernateassign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Operation {
	
	 Scanner sc=new Scanner(System.in);
	 
	
	 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Session session=factory.openSession();
     Brand brand;
    
	public void addBrand()
	{
		session.beginTransaction();
		
		Brand br=new Brand();
        System.out.println("Enter Brand ID: ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the new Brand: ");
        String name=sc.nextLine();
          br.setBid(n);
          br.setName(name);
          session.save(br);
          System.out.println("New Brand added successfully.");
          session.getTransaction().commit();
	}
	
	public void displayBrand()
	{
		session.beginTransaction();
		String query2="from Brand where bid=:i";
    	System.out.println("Enter the ID: ");
    	int id=sc.nextInt();
		Query q=session.createQuery(query2);
		q.setParameter("i",id);
		Brand br=(Brand)q.uniqueResult();
		System.out.println("B_Id: "+br.getBid()+"  Brand_Name: "+br.getName());
		session.getTransaction().commit();
	
	}
	
	public void updateBrand()
	{
		session.beginTransaction();
	  	Query q=session.createQuery("update Brand set name=:n where bid=:i");
	  	System.out.println("Enter the Brand ID: ");
        int i1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the new Brand name: ");
        String name1=sc.nextLine();
        q.setParameter("n", name1);
		q.setParameter("i", i1);
		int row=q.executeUpdate();
		System.out.println(row+" record updated successfully");
		session.getTransaction().commit();
	}
	
	public void deleteBrand()
	{
		session.beginTransaction();
		Query q1=session.createQuery("delete from Brand where bid=:i");
    	System.out.println("Enter the Brand ID: ");
        int i2=sc.nextInt();
    	q1.setParameter("i",i2);
    	int row1=q1.executeUpdate();	
    	System.out.println(row1+" record deleted successfully");
    	session.getTransaction().commit();
	}
	public void addItem()
	{
		session.beginTransaction();
		
		Category cat = new Category();
		System.out.println("Enter Item Name: ");
		String str = sc.nextLine();
		System.out.println("Enter no. of items: ");
		int it = sc.nextInt();
		cat.setcName(str);
		cat.setnItems(it);
		
		session.save(cat);
		System.out.println("New Item added successfully.");
		session.getTransaction().commit();
	}
	
	public void assignBrandToCategory(int bid,int cId)
	{
	//session.beginTransaction();
	Brand bd=session.get(Brand.class,bid);

	Category cate=session.get(Category.class,cId);
	List<Category> categories=new ArrayList<Category>();
	categories.add(cate);

	bd.setCategory(categories);
	cate.setBrand(bd);
	session.beginTransaction();
	session.saveOrUpdate(bd);
	System.out.println("Brand Name added successfully.");
	session.getTransaction().commit();


	}
	
	public void displayCategory()
	{
		session.beginTransaction();
		String query2="from Category where cId=:i";
    	System.out.println("Enter the ID: ");
    	int id=sc.nextInt();
		Query q=session.createQuery(query2);
		q.setParameter("i",id);
		Category category=(Category)q.uniqueResult();
		System.out.println("C_Id: "+category.getcId()+"  Item: "+category.getcName()+"  Stock: "+category.getnItems()+""
				+ "  Brand: "+category.getBrand().getName());
		session.getTransaction().commit();
	
	}
	public void update()
	{
		session.beginTransaction();
	  	Query q=session.createQuery("update Category set cName=:n, nItems=:it where cId=:i");
	  	System.out.println("Enter the category ID: ");
        int i1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the new category name: ");
        String name1=sc.nextLine();
        System.out.println("Set the no. of items: ");
        int items = sc.nextInt();
        q.setParameter("n", name1);
		q.setParameter("i", i1);
		q.setParameter("it", items);
		int row=q.executeUpdate();
		System.out.println(row+" record updated successfully");
		session.getTransaction().commit();
		
	}
	public void delete()
	{
		session.beginTransaction();
		Query q1=session.createQuery("delete from Category where cId=:i");
    	System.out.println("Enter the category ID: ");
        int i2=sc.nextInt();
    	q1.setParameter("i",i2);
    	int row1=q1.executeUpdate();	
    	System.out.println(row1+" record deleted successfully");
    	session.getTransaction().commit();
	}
	
	public void mainMenu()
	{
		System.out.println("Main Menu");
		System.out.println("===========================");
		System.out.println("Enter a choice: ");
    	System.out.println("1) Brand\t2) Category\t3) Exit");
    	int choice = sc.nextInt();
    	switch(choice)
    	{	
    	case 1:
    		brandMenu();
    		break;
    		
    	case 2:
    		 categoryMenu();
    		 break;
    		 
    	case 3:
    		System.out.println("Thank You for visiting our store.");
    		System.exit(0);

    	default:
    		System.out.println("Wrong Input!!");
    		System.exit(0);
    	}
	}
	
	public void brandMenu()
	{
		System.out.println("Brand Menu");
		System.out.println("========================");
		System.out.println("1) Add new Brand Name\n2) Display Brand by Id\n3) Add Brand to Category\n"
				+ "4) Update Brand By Id\n5) Delete Brand By Id\n6) Return to Main Menu");
		System.out.println("========================");
		System.out.println("Enter your choice: ");
        int ch=sc.nextInt();
        System.out.println("========================");
        switch(ch) {
        case 1:
        	addBrand();
        	System.out.println();
        	brandMenu();
        	System.out.println();
        	break;
        	
        case 2:
        	displayBrand();
        	System.out.println();
        	brandMenu();
        	System.out.println();
        	break;
        	
        case 3:
        	System.out.println("Enter Brand ID: ");
        	int brad = sc.nextInt();
        	System.out.println("Enter Category ID: ");
        	int categ = sc.nextInt();
        	assignBrandToCategory(brad, categ);
        	System.out.println();
        	brandMenu();
        	System.out.println();
        	break;
        	
        case 4:
        	updateBrand();
        	System.out.println();
        	brandMenu();
        	System.out.println();
        	break;
        	
        case 5:
        	deleteBrand();
        	System.out.println();
        	brandMenu();
        	System.out.println();
        	break;
        	
        case 6:
        	mainMenu();
        	System.out.println();
        	break;
        	
        default:
        	System.out.println("Wrong Input!!");
        }
	}
	
	public void categoryMenu()
	{
		System.out.println("Category Menu");
		System.out.println("========================");
		System.out.println("1) Display the items by Id\n2) Add new Item\n3) Update Item By Id\n4) Delete Item By Id\n5) Return to Main Menu");
		 System.out.println("========================");
		 System.out.println("Enter your choice: ");
	        int ch=sc.nextInt();
	        System.out.println("========================");
	        switch(ch) {
	        case 1:
	        	displayCategory();
	        	System.out.println();
	        	categoryMenu();
	        	System.out.println();
	        	break;
	        case 2:
	        	addItem();
	        	System.out.println();
	        	categoryMenu();
	        	System.out.println();
	        	break;
	        case 3:
	        	update();
	        	System.out.println();
	        	categoryMenu();
	        	System.out.println();
	        	break;
	        case 4:
	        	delete();
	        	System.out.println();
	        	categoryMenu();
	        	System.out.println();
	    		break;
	    		
	        case 5:
	        	mainMenu();
	        	System.out.println();
	        	break;
	        default:
	        	System.out.println("Wrong Input!!");
	        		}
	}
	
	
}
