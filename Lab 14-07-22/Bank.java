package basicpackage;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		int deposit, withdraw, balance,ch,new_bal;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your balance: ");
		balance = sc.nextInt();
		System.out.println("Balance: "+balance);
		System.out.println("Choose option: 1)Withdraw  2)Deposit: ");
		ch = sc.nextInt();
		if(ch==1)
		{
			System.out.println("Enter the amount to withdraw: ");
			withdraw = sc.nextInt();
			if(withdraw<balance)
			{
				new_bal = balance - withdraw;
				System.out.println("Withdraw successful");
				System.out.println("Balance: "+new_bal);
			}
			else
				System.out.println("Insufficient Balance.");
		}
		else if(ch==2)
		{
			System.out.println("Enter the amount to deposit: ");
			deposit = sc.nextInt();
			new_bal = balance + deposit;
			System.out.println("Balance: "+new_bal);
		}
		else
			System.out.println("Wrong Input!!");

	}

}
