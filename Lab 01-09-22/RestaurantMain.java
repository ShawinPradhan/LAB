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
			Restaurant rest = (Restaurant) map.get(id);
			Billing.order(rest.getFname(), rest.getPrice());
		
		Billing.cont();
			
		}while(true);

	}

}
