//WAP to count number of palindrome words in a string
package lab;
import java.util.Scanner;

public class NoOfPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,count =0;
		//sc.nextLine();
		System.out.println("Enter a string to count no. of palindrome words:");
		String s = sc.nextLine();
		String[] a = s.split(" ");
		
		for(i=0;i<a.length;i++)
		{
			String temp = "";
			for(j=(a[i].length())-1;j>=0;j--)
			{
				temp += a[i].charAt(j);
			}
			if(a[i].equalsIgnoreCase(temp))
				count++;
		}
		
		System.out.println("No. of palindrome words: "+count);

	}

}
