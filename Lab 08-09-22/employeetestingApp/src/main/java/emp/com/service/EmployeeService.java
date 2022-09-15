package emp.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import emp.com.entity.*;
import emp.com.exception.GlobalException;

public class EmployeeService {
private List<Employee> employee = new ArrayList<Employee>();
Scanner sc = new Scanner(System.in);


//method to add employee details in array list
public void addEmployee(long empId, String name, double sal, String city, String country)
{
	Address add = new Address(city, country);
	employee.add(new Employee(empId, name, sal, add));
	
}


//for testing using builder annotation
public void addEmp(Employee emp)
{
	employee.add(emp);
}


//method to display all employee details
public void displayAllEmployee()
{
	for(Employee emp:employee)
	{
		System.out.println("Employee ID: "+ emp.getEmpId());
		System.out.println("Employee Name: "+ emp.getEmpName());
		System.out.println("Employee Salary: "+emp.getEmpSal());
		System.out.println("Employee Address: "+emp.getAddress().getCity()+" "+
		emp.getAddress().getCountry());
	}
}

//method to display employee details using id
public Employee displayEmpById(int id) throws GlobalException
{
	for(int i=0;i<employee.size();i++)
	{
		if(employee.get(i).getEmpId()==id)
		{
//			System.out.println("Employee ID: "+ employee.get(i).getEmpId());
//			System.out.println("Employee Name: "+ employee.get(i).getEmpName());
//			System.out.println("Employee Salary: "+employee.get(i).getEmpSal());
//			System.out.println("Employee Address: "+employee.get(i).getAddress().getCity()+" "+
//					employee.get(i).getAddress().getCountry());
			return employee.get(i);
		}
		else
		{
			throw new GlobalException("Employee ID not found.");
		}
	}
	return null;
}

//remove or delete using employee id
public void removeEmployee(int id) throws GlobalException
{
	for(int i=0;i<employee.size();i++)
	{
		if(employee.get(i).getEmpId()==id)
		{
			employee.remove(i);
		}
		else
		{
			throw new GlobalException("Employee with ID "+id+" not found.");
		}
			
	}
}


//update employee details using id
public void updateEmployeeDetails(int id) throws GlobalException
{
	for(int i=0;i<employee.size();i++)
	{
		if(employee.get(i).getEmpId()==id)
		{
			
			System.out.println("Enter Employee id:");
			int id1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name:");
			String name1  = sc.nextLine();
			System.out.println("Enter Employee Salary:");
			double sal = sc.nextDouble(); 
			sc.nextLine();
			System.out.println("Enter Employee city:");
			String city1 = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Employee country:");
			String country1= sc.nextLine();
			
			Address add1 = new Address(city1, country1);
			employee.set(i, new Employee(id1, name1, sal , add1));
		}
		else
			throw new GlobalException("Employee with ID"+id+" not found.");
	}
}

public Employee findId(int id)
{
	Employee emp = null;
	for(int i=0;i<employee.size();i++)
	{
		if(employee.get(i).getEmpId()==id)
		{
			emp=employee.get(i);
		}
	}
	return emp;
}


//update employee
public Employee updateEmp(int index, Employee emp) 
		throws GlobalException
{
	return employee.set(index, emp);
}



//clear
public String deleteAllEmployeeDetails()
{
	employee.clear();
	return "All employees deleted successfully";
}

//calculate the yearly salary of employee
public double calculateYearlySalary(int id)
{
	double yearlySalary=0.0;
	for(int i=0;i<employee.size();i++)
	{
		if(employee.get(i).getEmpId()==id)
		{
			yearlySalary= employee.get(i).getEmpSal()*12;
		}
	}
	return yearlySalary;
}

//calculate the appraisal amount of employee
public double calculateAppraisalById(long empId)
{
	double appraisal =0.0;
	
	for(int i=0;i<employee.size();i++)
	{
		if(employee.get(i).getEmpId()==empId)
		{
			if(employee.get(i).getEmpSal()<10000)
				appraisal =1000;
			else
				appraisal=2000;	
		}
	}
	return appraisal;
}

public int lengthOfList()
{
	return employee.size();
}


}
