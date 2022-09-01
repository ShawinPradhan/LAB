package restarraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import collectionframework.Employee;

public class RestaurantMain {

	public static void main(String[] args) {
		//ArrayList<Restaurant> al = new ArrayList<Restaurant>();
		Scanner sc = new Scanner(System.in);
		char ch;
		int id;
		Map<Integer, Restaurant> map = new HashMap<Integer, Restaurant>();
		
		map.put(1, new Restaurant("Chicken Momo",100));
		map.put(2, new Restaurant("Veg Momo",80));
		map.put(3, new Restaurant("Mutton Momo",150));
		map.put(4, new Restaurant("Cold Drink",40));
		map.put(5, new Restaurant("Ice Cream",50));
		
		System.out.println("Welcome to Bird's View");
		System.out.println("======================");
		System.out.println("MENU");
		System.out.println("=====");
		System.out.println("ITEMS\t\tPrice");

		Set<Map.Entry<Integer, Restaurant>> res = map.entrySet();
		
		for(Map.Entry em:res)
		{
			Restaurant rest = (Restaurant) em.getValue();
			System.out.print(em.getKey()+")");
			rest.display();
			
		}
		System.out.println("======================");
		
		do {
			System.out.println("Please enter food id:");
			id = sc.nextInt();
			switch(id)
			{
			case 1:
				Restaurant rest = (Restaurant) map.get(1);
				Billing.order(rest.getFname(), rest.getPrice());
				break;
			
			case 2:
				Restaurant rest1 = (Restaurant) map.get(2);
				Billing.order(rest1.getFname(), rest1.getPrice());
				break;
				
			case 3:
				Restaurant rest3 = (Restaurant) map.get(3);
				Billing.order(rest3.getFname(), rest3.getPrice());
				break;
				
			case 4:
				Restaurant rest4 = (Restaurant) map.get(4);
				Billing.order(rest4.getFname(), rest4.getPrice());
				break;
				
			case 5:
				Restaurant rest5 = (Restaurant) map.get(5);
				Billing.order(rest5.getFname(), rest5.getPrice());
				break;
				
			default:
				System.out.println("Wrong Input!!");
			}
			Billing.cont();
			
		}while(true);

	}

}
