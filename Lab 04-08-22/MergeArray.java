//WAP to merge two arrays into another array
package arrayexmaples;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		int s,i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 1st array:");
		s= sc.nextInt();
		System.out.println("Enter "+s+" elements for 1st array: ");
		int a[]=new int[s];
		for(i=0;i<s;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of 2nd array:");
		n= sc.nextInt();
		System.out.println("Enter "+n+" elements for 2nd array: ");
		int b[]=new int[n];
		for(i=0;i<n;i++)
		{
			b[i] = sc.nextInt();
		}
		
		
		int c[]=new int[a.length + b.length];
		
		for(i=0;i<s;i++)
		{
			c[i]=a[i];
		}
		
			for(i=0;i<n;i++)
			{
				c[s+i]=b[i];
			}
		
		//printing merged array
		System.out.println("Merged array: ");
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

	}

}
