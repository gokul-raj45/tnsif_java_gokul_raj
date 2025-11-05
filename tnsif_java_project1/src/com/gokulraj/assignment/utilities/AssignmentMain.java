package com.gokulraj.assignment.utilities;
import com.gokulraj.assignment.employees.*;
import com.gokulraj.assignment.utilities.*;

public class AssignmentMain {

	public static void main(String[] args) {
		Manager m1=new Manager();
		Developer d1=new Developer();
		EmployeesUtilities u1=new EmployeesUtilities();
		
		m1.setDept("computerscience");
		m1.setTeamSize(5);
		d1.setProjectName("tnsif_project");
		d1.setProgrammingLanguage("java");
		m1.setName("gokul");
		d1.setName("raj");
		
		m1.setEmployeeId(101);
		m1.setSalary(50000);
		d1.setEmployeeId(102);
		d1.setSalary(60000);
		
		
		u1.employeeDetails(m1);
		u1.employeeDetails(d1);
		
		u1.increaseSalary(m1, 10);
		u1.increaseSalary(d1, 20);
		
		
		
		

	}

}
