//WAP to find the maximum and minimum number in an array
package arrayexmaples;
import java.util.Scanner;

public class MaxMinNumber {

	public static void main(String[] args) {
		int s,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		s = sc.nextInt();
		int ar[]= new int[s];
		System.out.println("Enter "+s+" elements: ");
		for(i=0;i<s;i++)
		{
			ar[i]= sc.nextInt();
		}
		
		int max=ar[0];
		int min=ar[0];
		//to find the maximum and minimum number
		for(i=0;i<s;i++)
		{
			if(ar[i]>max)
				max=ar[i];
			else if(ar[i]<min)
				min=ar[i];
		}
		
		System.out.println("Maximum number: "+max);
		System.out.println("Minimum number: "+min);
		
	}

}
