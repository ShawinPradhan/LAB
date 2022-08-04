//WAP to add two array elements and store it in another array
package arrayexmaples;
import java.util.Scanner;

public class AddElements {

	public static void main(String[] args) {
		int i,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		s= sc.nextInt();
		System.out.println("Enter "+s+" elements for 1st array: ");
		int a[]=new int[s];
		for(i=0;i<s;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter "+s+" elements for 2nd array: ");
		int b[]=new int[s];
		for(i=0;i<s;i++)
		{
			b[i] = sc.nextInt();
		}
		
		int c[]=new int[s];
		for(i=0;i<s;i++)
		{
			c[i] = a[i] + b[i];
		}
		
		System.out.println("Adding two arrays: ");
		for(i=0;i<s;i++)
		{
			System.out.println(c[i]);
		}

	}

}
