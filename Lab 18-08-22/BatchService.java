package batchapplication;
import java.util.Scanner;

public class BatchService {
	static Scanner sc= new Scanner(System.in);
	static Java java[] = new Java[50];
	static AWS aws[] = new AWS[50];
	static int id,num;
	static String sname,mail;
	static int jindex =0;
	static int aindex = 0;
	static String cname="";
	
	//student info taking java course
	public static void javaStudentInfo()
	{
		System.out.println("Enter student id:");
		id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter student name:");
		sname = sc.nextLine();
		
		System.out.println("Enter phone no.:");
		num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter email address:");
		mail = sc.nextLine();
		
		java[jindex] = new Java(id,sname,num,mail);
		jindex++;
		System.out.println("Student information has successfully been registered.");
	}
	
	public static void getJavaStudentDetails()
	{
		for(int i=0;i<jindex;i++)
		{
			System.out.println("Student ID: "+java[i].getStdId());
			System.out.println("Student Name: "+java[i].getStdName());
			System.out.println("Student Number: "+java[i].getPhno());
			System.out.println("Student email: "+java[i].getEmail());
			System.out.println("Course Name: JAVA");
			System.out.println("=========================");
		}
	}
	//student info taking aws course
	public static void awsStudentInfo()
	{
		System.out.println("Enter student id:");
		id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter student name:");
		sname = sc.nextLine();
		
		System.out.println("Enter phone no.:");
		num = sc.nextInt();

		sc.nextLine();
		
		System.out.println("Enter email address:");
		mail = sc.nextLine();
		
		aws[aindex] = new AWS(id,sname,num,mail);
		aindex++;
		System.out.println("Student information has successfully been registered.");
	}
	
	public static void getAwsStudentDetails()
	{
		for(int i=0;i<aindex;i++)
		{
			System.out.println("Student ID: "+aws[i].getStdId());
			System.out.println("Student Name: "+aws[i].getStdName());
			System.out.println("Student Number: "+aws[i].getPhno());
			System.out.println("Student email: "+aws[i].getEmail());
			System.out.println("Course Name: AWS");
			System.out.println("=========================");
		}
	}
	
	public static void courseNotAvailable(String cname)
	{
		if(cname.equalsIgnoreCase("java") || cname.equalsIgnoreCase("aws"))
		{
			System.out.println("Please try again.");
			System.out.println();
		}
		else
			throw new NoCourseFoundException("No suitable course found.");
	}
	
	public static void updateJavaStudentInfo()
	{
		int i;
		System.out.println("Enter Student Id:");
		id = sc.nextInt();
		for(i=0;i<jindex;i++)
		{
			if(id==java[i].getStdId())
			{
				System.out.println("Enter new student id:");
				id = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter new student name:");
				sname = sc.nextLine();
				
				System.out.println("Enter new phone no.:");
				num = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter new email address:");
				mail = sc.nextLine();
				
				java[i] = new Java(id,sname,num,mail);
				System.out.println("Update successful.");
			}
			else
				System.out.println("No such student found in the system.");
		}
	}
	
	public static void updateAwsStudentInfo()
	{
		int i;
		System.out.println("Enter Student Id:");
		id = sc.nextInt();
		for(i=0;i<aindex;i++)
		{
			if(id==aws[i].getStdId())
			{
				System.out.println("Enter new student id:");
				id = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter new student name:");
				sname = sc.nextLine();
				
				System.out.println("Enter new phone no.:");
				num = sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Enter new email address:");
				mail = sc.nextLine();
				
				aws[i] = new AWS(id,sname,num,mail);
				System.out.println("Update successful.");
			}
			else
				System.out.println("No such student found in the system.");
		}
	}
}
