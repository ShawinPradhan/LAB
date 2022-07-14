//Program to print strong number from 1 to 100
package basicpackage;

public class StrongNumber1to100 {

	public static void main(String[] args) {
		int i,fact,temp, rem,num;
		System.out.println("Strong numbers between 1 to 100 are: ");
		for(num=1;num<=100;num++)
		{
			int sum=0;
			temp=num; //storing the value of num in temp variable
			while(temp!=0) //checking whether num is not equal to zero
			{
				rem = temp%10; // getting the reminder
				fact=1; //setting value of fact as 1
				for(i=1;i<=rem;i++) 
				{
					fact = fact *i; //finding the factorial
				}
				sum += fact; //adding the factorial to the sum
				temp=temp/10; // getting quotient
			}
			if(sum==num)
				System.out.println(" "+num);
		}

	}

}
