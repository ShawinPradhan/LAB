package basicpackage;
import java.util.Scanner;

public class PatternInverted {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		n =sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
