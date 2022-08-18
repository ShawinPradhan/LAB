package batchapplication;
import java.util.Scanner;

public class BatchMain {

	public static void main(String[] args) {
		int choice,ch;
		Scanner sc = new Scanner(System.in);
		BatchService batchs = new BatchService();
		System.out.println("Welcome to Anudip Foundation");
		System.out.println("============================");
		do {
		System.out.println("Please choose which course you want to pursue:\n"
				+ "1)JAVA  2)AWS  3)Others  4)Quit");
		System.out.println("================================");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("---JAVA---");
			System.out.println("1)Enter Student Info\t2)Show Student Info\t3)Update Student Info");
			ch= sc.nextInt();
			if(ch==1)
			{
				batchs.javaStudentInfo();
				System.out.println();
			}
			else if(ch==2)
			{
				batchs.getJavaStudentDetails();
				System.out.println();
			}
			else if(ch==3)
			{
				batchs.updateJavaStudentInfo();
				System.out.println();
			}
			else
				System.out.println("Wrong Input");
			break;
			
		case 2:
			System.out.println("---AWS---");
			System.out.println("1)Enter Student Info\t2)Show Student Info\t3)Update Student Info");
			ch= sc.nextInt();
			if(ch==1)
			{
				batchs.awsStudentInfo();
				System.out.println();
			}
			else if(ch==2)
			{
				batchs.getAwsStudentDetails();
				System.out.println();
			}
			else if(ch==3)
			{
				batchs.updateAwsStudentInfo();
				System.out.println();
			}
			else
				System.out.println("Wrong Input");
			break;
		
		case 3:
			try {
				System.out.println("Enter a course name: ");
				String course = sc.next();
				batchs.courseNotAvailable(course);
			}catch(NoCourseFoundException e)
			{
				System.out.println(e.getMessage());
				System.out.println();
			}
		
		case 4:
			System.exit(0);
		}
		}while(choice!=4);

	}

}
