//WAP to find the maximum and minimum number in an array
package arrayexmaples;
import java.util.Scanner;

public class MaxMinNumber {

	public static void main(String[] args) {
		int max=0, min=0, s,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		s = sc.nextInt();
		int ar[]= new int[s];
		System.out.println("Enter "+s+" elements: ");
		for(i=0;i<s;i++)
		{
			ar[i]= sc.nextInt();
		}
		
		//to find the maximum and minimum number
		for(i=0;i<s;i++)
		{
			for(j=0;j<s;j++)
			{
				if(ar[j]>ar[i])
				{
					max = ar[j];
				}
				else
					min = ar[i];
			}
		}
		
		System.out.println("Maximum number: "+max);
		System.out.println("Minimum number: "+min);
		
	}

}
