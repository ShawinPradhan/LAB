package restaurant;
import java.util.Scanner;

public class RestaurantService {
	static Scanner sc = new Scanner(System.in);
	//declaring array to store items
	static String item[] = new String[] {"Veg Combo","Non-Veg Combo","Ice Cream",
					"Cold Drink","Quit"};
	//declaring array to store the price of items
	static int price[] = new int[] {250,300,120,40,0};
	static double sum = 0.0;
	static String order="";
	static int quantity[] = new int[10];
	static double temp =0.0; //temporary variable
	static final double tax = 0.15; //15% tax
	
	public static void menu()
	{
		
		System.out.println("MENU");
		System.out.println("====");
		System.out.println("ITEMS\t\t\tPrice(Rs.)");
			for(int i=0;i<price.length;i++) //to print the array
			{
				System.out.println((i+1)+")"+item[i]+"\t\t"+price[i]);
			}
		
	}
	
	public void chooseMenu(int ch)
	{
		if(ch==5)
			System.exit(0);
	    if(ch>0 && ch<10)
	    {
		System.out.println("Enter the no. of quantites of "+item[ch-1]+":");
                 int q=sc.nextInt();
	         quantity[ch-1]+=q;
		
	    }
	    else
	    {
               System.exit(0);
              
         }
	}

	public static void cont()
	{
		System.out.println("Do you want to continue? y/n");
		char ch = sc.next().charAt(0); //taking the next character
		if(ch!='y') //if the char is not y or is n then the loop gets run 
		{
			System.out.println();
			billTotal(); //we get the bill
			System.exit(0); //exit
		}
		System.out.println();
	}
	
	//get bill
	public static void billTotal()
	{
		System.out.println("BILL");
		System.out.println("=======");
		System.out.println("Total Order:\t    Quantity:   Price:"); //shows all the orders user requested
		for(int i=0;i<10;i++)
	    {
             if(quantity[i]!=0)
	     {
	      sum+=quantity[i]*price[i];
              System.out.println(item[i]+"\t\t"+quantity[i]+"\tRs. "+quantity[i]*price[i]);
	     }
	    }
		System.out.println("Tax: 15%"); //tax of 15%
		System.out.println("Amount: Rs. "+sum); //showing the sum without the tax added
		System.out.println("Total Amount: Rs. "+(sum+tax)); //total amount with tax included
		System.out.println();
		System.out.println("Thank you for visiting Bird's View,\nPlease visit again.");
	
	}
	
	
}
