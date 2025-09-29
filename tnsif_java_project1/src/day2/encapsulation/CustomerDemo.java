package day2.encapsulation;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setId(101);
		c.setName("gokul");
		c.setCity("Panruti");
		System.out.println(c);
		
		Customer c1=new Customer();
		c1.setId(102);
		c1.setName("raj");
		c1.setCity("Panruti");
		System.out.println(c1);

	}

}
