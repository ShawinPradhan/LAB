//WAP to show the first and last digit of a number
package lab;
import java.util.Scanner;

public class FirstLastElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int last =0;
		int first=0;
		System.out.println("Enter a number: ");
		n= sc.nextInt();
		
		last=n%10;
		System.out.println("Last element: "+last);
		
		while(n!=0)
		{
			first = n%10;
			n = n/10;
		}
		
		System.out.println("First element: "+first);
		
		
	}

}
