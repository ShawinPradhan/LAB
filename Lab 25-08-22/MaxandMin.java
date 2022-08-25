//WAP to find the maximum and minimum number in an array
package lab;
import java.util.Scanner;

public class MaxandMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size,i;
		
		System.out.println("Enter the size for array:");
		size = sc.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter "+size+" elements:");
		for(i=0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array elements:");
		for(i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int max_num = a[0];
		int min_num = a[0];
		
		System.out.println();
		for(i=0;i<size;i++)
		{
			if(a[i]<min_num)
				min_num=a[i];
			if(a[i]>max_num)
				max_num=a[i];
		}
		
		System.out.println("Maximum number: "+max_num);
		System.out.println("Minimum number: "+min_num);

	}

}
