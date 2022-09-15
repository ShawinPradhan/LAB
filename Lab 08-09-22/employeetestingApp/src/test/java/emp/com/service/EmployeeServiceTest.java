package emp.com.service;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.assertj.core.api.Assertions.*;

import emp.com.entity.Address;
import emp.com.entity.Employee;
import emp.com.exception.GlobalException;

@TestMethodOrder(value = OrderAnnotation.class)

class EmployeeServiceTest {

	static EmployeeService employeeService;
	static List<Employee> emplist;
	
	@BeforeAll
	static void init()
	{
		
		//emplist = new ArrayList<Employee>();
	}
	
	@BeforeEach
	void setUp() throws Exception {
		employeeService = new EmployeeService();
	}

	@AfterEach
	void tearDown() throws Exception {
		employeeService = null;
		System.out.println("Object is garbage collected.");
	}

	
	@Test
	@DisplayName("Testing add employee method")
	@Order(1)
	public void testAddEmployee()
	{
		//way 1
//		employeeService.addEmployee(123, "nil", 20000, "Kolkata", "India");
//		employeeService.addEmployee(124, "sha", 25000, "Darjeeling", "India");
//		assertEquals(2, employeeService.lengthOfList());
		
		// way 2 using builder
		Address add = Address.builder().city("Darjeeling").country("India").build();
		Employee emp = Employee.builder().empId(101).empName("Shawin").
				empSal(25000).address(add).build();
		employeeService.addEmp(emp);
		int length = employeeService.lengthOfList();
		assertThat(length>0).isTrue();
		
	}
	
	@Test
	@DisplayName("Testing display name by id")
	@Order(2)
	public void displayEmpById() throws GlobalException
	{
		Address add = Address.builder().city("Kolkata").country("India").build();
		Employee emp = Employee.builder().empId(102).empName("Nilanjan").
				empSal(25000.00).address(add).build();
		employeeService.addEmp(emp);
		Employee e =employeeService.displayEmpById(102);
		//assertEquals("Nilanjan",e.getEmpName());
		assertThat(e.getEmpSal()).isEqualByComparingTo(25000.00);
	}
	
	@Test
	@DisplayName("Test case for calculating appraisal")
	@Order(4)
	public void testCalculateAppraisalById()
	{
		employeeService.addEmployee(101, "shawin", 25000, "Darjeeling", "India");
		double appraisal = employeeService.calculateAppraisalById(101);
		//assertEquals(2000, appraisal);
		assertThat(appraisal).isEqualTo(2000);
	}
	
	@Test
	@DisplayName("Test case for updating employee")
	@Order(3)
	public void testUpdateEmp() throws GlobalException
	{
		employeeService.addEmployee(101, "nilanjan", 25000, "Darjeeling", "India");
		Employee emp = employeeService.findId(101);
		emp.setEmpName("Shawin");
		
		Employee update = employeeService.updateEmp(0, emp);
		assertThat(update.getEmpName()).isEqualTo("Shawin");
		
	}
	
	
	@Test
	@DisplayName("Testing delete all employee")
	@Order(value =7)
	public void testdeleteAllEmployeeDetails()
	{
		assertEquals("All employees deleted successfully", employeeService.deleteAllEmployeeDetails());
	}
	
	
	@Test
	@Order(5)
	@DisplayName("Testing calculate yearly salary")
	public void testcalculateYearlySalary()
	{
		Address add = Address.builder().city("Kolkata").country("India").build();
		Employee emp = Employee.builder().empId(102).empName("Nilanjan").
				empSal(25000.00).address(add).build();
		employeeService.addEmp(emp);
		double sal = employeeService.calculateYearlySalary(102);
		//assertEquals(300000.00, sal);
		assertThat(sal).isEqualTo(300000);
	}
	

	

}
