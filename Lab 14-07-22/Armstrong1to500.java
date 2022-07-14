//Program to print Armstrong number from 1 to 500

package basicpackage;
import java.lang.Math;
public class Armstrong1to500 {

	public static void main(String[] args) {
		int i,sum=0,temp,rem;
		System.out.println("Armstrong numbers from 1 to 500 are: ");
		for(i=1;i<=500;i++)
		{
			temp = i; //storing the value of i in temp variable
			while(temp!=0) //checking whether the number is not equal to zero
			{
				rem = temp%10; // finding the remainder
				sum += rem*rem*rem; //adding sum with rem 3 times
				temp =temp/10;
			}
			if(sum==i) //checking if sum is equal to the value of i
			{
				System.out.println(i);
			}
			sum=0; //setting the value of sum =0
		}

	}

}
