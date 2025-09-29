package day2;

public class Student {

	private int std_Id;
	private String std_Name;
	private String std_Location;
	public int getStd_Id() {
		return std_Id;
	}
	public void setStd_Id(int std_Id) {
		this.std_Id = std_Id;
	}
	public String getStd_Name() {
		return std_Name;
	}
	public void setStd_Name(String std_Name) {
		this.std_Name = std_Name;
	}
	public String getStd_Location() {
		return std_Location;
	}
	public void setStd_Location(String std_Location) {
		this.std_Location = std_Location;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Student_id: "+std_Id+" Student_name "+std_Name+" Student_location: "+std_Location;
	}
	
	
	
	

}
