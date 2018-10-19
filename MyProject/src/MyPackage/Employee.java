package MyPackage;

public class Employee {

	int id;
	String name;
	
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public void display()
	{
		System.out.println("Emp ID :"+this.id);
		System.out.println("Emp Name :"+this.name);
		
	}
}
