//WAP to reverse an array
package lab;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s,i;
		System.out.println("Enter the size of array:");
		s = sc.nextInt();
		int b[]= new int[s];
		System.out.println("Enter "+s+" elements:");
		for(i=0;i<s;i++)
		{
			b[i] =sc.nextInt();		
		}
		
		System.out.println("Original array:");
		for(i=0;i<s;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		System.out.println("Reversed array:");
		for(i=s-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
	}

}
