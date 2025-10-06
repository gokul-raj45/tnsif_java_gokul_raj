package com.gokulraj.assignment.employees;

public class Manager extends Employee {

	private int teamSize;
	private String dept;
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String displayInfo() {
		// TODO Auto-generated method stub
		super.displayInfo();
		return "department: "+dept+"teamSize: "+teamSize;
	}
	
		

	

}
