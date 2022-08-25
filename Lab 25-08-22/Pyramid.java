//WAP to print a pyramid
package lab;
import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,j;
		System.out.println("Enter the no. of rows: ");
		n =sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
