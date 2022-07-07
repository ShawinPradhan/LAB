package basicpackage;
import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		int curr_year, join_year, diff;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter current year: ");
		curr_year = sc.nextInt();
		System.out.println("Enter year of joining: ");
		join_year = sc.nextInt();
		diff = curr_year - join_year;
		if (diff>=3)
			System.out.println("The employee will receive 3500 bonus.");
		else
			System.out.println("The employee will not receive the bonus.");

	}

}
