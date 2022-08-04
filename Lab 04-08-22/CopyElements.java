//WAP to copy all the elements of an array into another array
package arrayexmaples;
import java.util.Scanner;

public class CopyElements {

	public static void main(String[] args) {
		int i,s;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		s= sc.nextInt();
		System.out.println("Enter "+s+" elements: ");
		int a[]= new int[s];
		int b[] = new int[s];
		for(i=0;i<s;i++)
		{
			a[i] = sc.nextInt();
		}
		
		//to copy elements
		for(i=0;i<s;i++)
		{
				b[i]=a[i];
		}
		
		System.out.println("Copied array: ");
		for(i=0;i<s;i++)
		{
			System.out.println(b[i]);
		}


	}

}
