package com.gokulraj.assignment.utilities;
import com.gokulraj.assignment.employees.*;

public class EmployeesUtilities{
	public void increaseSalary(Employee employee,double percentage) {
		double new_salary=employee.getSalary()+(employee.getSalary() *percentage/100);
		employee.setSalary(new_salary);
		System.out.println("Salary Updated Successfully to: "+new_salary+"for "+employee.getName());
		//System.out.println(new_salary);
	}

	public void employeeDetails(Employee employee){
		System.out.println("-----------employee details-----------");
		
		System.out.println(employee.displayInfo());
		
		System.out.println("-------------------------------------\n");
		
	}
}
