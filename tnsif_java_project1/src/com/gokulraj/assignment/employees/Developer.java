package com.gokulraj.assignment.employees;

public class Developer extends Employee {
	private String projectName;
	private String programmingLanguage;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	@Override
	public String displayInfo() {
		// TODO Auto-generated method stub
		
		return "projectName: "+projectName+"programmingLanguage: "+programmingLanguage;
	}
	
	

}
