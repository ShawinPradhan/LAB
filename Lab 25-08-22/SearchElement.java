//WAP to search an element in an array
package lab;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int i,size;
	boolean f =false;
	System.out.println("Enter the size of array: ");
	size = sc.nextInt();
	int a[]= new int[size];
	System.out.println("Enter "+size+" elements:");
	for(i=0;i<size;i++)
	{
		a[i]= sc.nextInt();
	}
	
	System.out.println("Elements of array:");
	for(i=0;i<size;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();

	System.out.println("Enter element to search: ");
	int s = sc.nextInt();
	
	for(i=0;i<size;i++)
	{
		if(a[i]==s)
		{
			f = true;
			break;
		}
	}
	
	if(f==true)
		System.out.println("The element "+s+" is present on: "+(i+1)+" position.");
	else
		System.out.println("Element not found!!");
	}

}
