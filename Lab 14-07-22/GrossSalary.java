package basicpackage;
import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) {
		int basic;
		float DA,HRA,gross_sal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		basic = sc.nextInt();
		if(basic>1500)
		{
			DA = basic * 0.9f;
			HRA = basic * 0.2f;
		}
		else
		{
			HRA = 500.00f;
			DA = basic * 0.7f;
		}
		gross_sal = DA + HRA + basic;
		System.out.println("Gross Salary: "+gross_sal);

	}

}
