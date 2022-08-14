package UseGlobleVariable;

public class globlestd {

	// name, des, empId, emp age, emp salary,emp gender,
	
	String name;    // Declare variable as globally
	String emp_ID;
	Float age;
	Float salary;
	char gender;
	static float v;
	
	public void Emp_Info()     // create non-static method
	{
		// Usage
		System.out.println("My name is "+name);       
		System.out.println("My employee I'd is "+emp_ID);
		System.out.println("My age is "+age);
		System.out.println("My salary is around "+salary+"K per month");
		System.out.println("My gender is "+gender);
		
	}
	
	
		
	
	
}
