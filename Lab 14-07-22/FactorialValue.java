//Program to print factorial value from 1 to 10
package basicpackage;
import java.util.Scanner;

public class FactorialValue {

	public static void main(String[] args) {
		int fact =1;
		for(int i=1;i<=10;i++)
		{
			fact = fact*i;
			System.out.println("The factoriral of "+i+" is: "+fact);
		}

	}

}
