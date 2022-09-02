package restarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Billing {
	static ArrayList<Bill> list = new ArrayList<Bill>();
	static Scanner sc = new Scanner(System.in);
	
	
	static void order(String fname, int amt)
	{
		System.out.println("Enter quantity for "+fname+":");
		int qty = sc.nextInt();
		list.add(new Bill(fname,qty,qty*amt));
	}
	
	static void totalBill()
	{
		System.out.println("BILL");
		System.out.println("=====");
		System.out.println("ITEMS\t    QUANTITY\tAMOUNT");
		System.out.println("===============================");
		double total = 0.0;
		for(Bill i: list)
		{
			System.out.println(i.fname+"\t"+i.qty+"\t"+i.amt);
			total = total + i.amt;
		}
		
		System.out.println();
		System.out.println("Amount:\tRs. "+total);
		double gst = total*0.05;
		System.out.println("GST:\tRs. "+gst);
		System.out.println("--------------------");
		double ftotal= total+gst;
		System.out.println("Total:\tRs. "+ftotal);
	}
	
	static void cont()
	{
		System.out.println("Do you want to continue? y/n");
		char ch = sc.next().charAt(0); //taking the next character
		if(ch!='y') //if the char is not y or is n then the loop gets run 
		{
			System.out.println();
			totalBill(); //we get the bill
			System.out.println();
			coupon();
			System.exit(0);
		}
		System.out.println();
	}
	
	static void coupon()
	{
		System.out.println("Do you have a coupon?  y/n");
		char ch = sc.next().charAt(0);
		if(ch=='y')
		{
			int coupon = 123456;
			System.out.println("Enter the coupon code:");
			int code = sc.nextInt();
			if(code==coupon)
			{
				double total = 0.0;
				for(Bill i: list)
				{
					total = total + i.amt;
				}
				System.out.println();
				System.out.println("Amount:\tRs. "+total);
				double gst = total*0.05;
				System.out.println("GST:\tRs. "+gst);
				System.out.println("--------------------");
				double ftotal= total+gst;
				System.out.println("Total:\tRs. "+ftotal);
				double temp = ftotal * 0.1;
				double disc = ftotal - temp;
				System.out.println("Total After Discount:\tRs. "+disc);
				System.exit(0);
			}
			else
			{
				System.exit(0);
			}
				
		}
	}
	
	}
