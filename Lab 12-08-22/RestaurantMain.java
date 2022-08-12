package restaurant;
import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice;
		boolean quit=false;
		RestaurantService res = new RestaurantService();
		System.out.println("WELCOME TO BIRD's VIEW");
		System.out.println("======================");
		res.menu();
		System.out.println("=======================================");
		do {
			System.out.println("Please choose an item:");
			choice = sc.nextInt();
			res.chooseMenu(choice);
			res.cont();
			
		}while(true);
		
	}

}
