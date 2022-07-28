package abstractiondemo;
import java.util.*;

abstract class Vaccine1{
	String citizen,c_name;
	int age,amount,choice,ch2;
	Date firstdate,seconddate;
	
	
	/**
	 * 
	 */
	public void firstDose() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name: ");
	c_name = sc.nextLine();
	System.out.println("Enter citizenship: ");
	citizen = sc.nextLine();
		if((citizen.equals("Indian")||citizen.equals("INDIAN")||citizen.equals("indian")))
		{
			System.out.println("Enter Age: ");
			age= sc.nextInt();
			if(age>=18)
			{
			System.out.println("Eligible to receive 1st Dose.");
			System.out.println();
			System.out.println("Enter the amount to pay: ");
			amount = sc.nextInt();
				if(amount==250)
				{
					System.out.println("Payment Successful.");
					System.out.println("1st Dose vaccinated.");
					System.out.println();
				}
				else {
					System.out.println("Wrong amount.");
					System.out.println("Payment not successful.");
					}
			}
			else {
				System.out.println("You should be atleast 18 years old or above.");
				System.exit(0);
			}
		}	
		else {
			System.out.println("Not eligible for vaccination.");
			System.exit(0);
		}
	firstdate = new Date();
	System.out.println("Today's Date: "+firstdate);
	System.out.println();
	}
	
	public void secondDose() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Check eligibility for 2nd Dose.");
		System.out.println("Have you received your 1st Dose? \n1)Yes 2)No" );
		choice=sc.nextInt();
		if(choice==1)
		{
		System.out.println("Eligible for 2nd Dose.");
		System.out.println("Would you like to receive 2nd dose? \n1)Yes  2)No");
		ch2=sc.nextInt();
		if(ch2==1)
		{
			System.out.println("2nd Dose vaccinated.");
			System.out.println();
		}
		else
		{
			System.out.println("Please come later for your 2nd dose.");
			System.out.println();
		}
		}
		else if(choice==2)
		{
			System.out.println("Not eligible for 2nd dose.");
			System.exit(0);
		}
		else
			System.exit(0);
	}
	
	
	abstract public void boosterDose();
}
class vaccinationSuccessful1 extends Vaccine1{
	@Override
	public void boosterDose() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Check if eligible for booster: ");
		System.out.println("Received both doses? 1)Yes  2)No");
		int ch = sc.nextInt();
		if(ch==1) {
			System.out.println("Eligible for booster.");
			System.out.println("Vaccination Successful!!");
			System.out.println();
			}
		else
			System.out.println("Not elibile for the booster.");
	}
		
	}
	
public class Vaccination1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		vaccinationSuccessful1 vc = new vaccinationSuccessful1();
		int c;
		do{
			System.out.println("Check for eligibility: \n1)1st Dose  2)2nd Dose  3)Booster  4)Quit");
			c= sc.nextInt();
			switch(c)
			{
			case 1:
				vc.firstDose();
				break;
			case 2:
				vc.secondDose();
				break;
			case 3:
				vc.boosterDose();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("!!!Wrong Input!!!");
			}
		}while(true);
	}

}
