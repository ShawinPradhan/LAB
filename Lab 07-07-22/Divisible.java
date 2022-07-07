import java.util.Scanner;
 
public class Divisible {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		number = sc.nextInt();
		if((number%5==0) && (number%11 == 0))
		{
			System.out.println(number+" is divisible by both 5 and 11.");
		}
		else
		{
			System.out.println(number+" is not divisible by both 5 and 11.");
		}

	}

}
