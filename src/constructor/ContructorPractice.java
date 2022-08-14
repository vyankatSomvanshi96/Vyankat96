package constructor;

public class ContructorPractice {

	int a;     // Variable declaration as globally
	int b;
	
	public static void main(String[] args) 
	{
		ContructorPractice V=new ContructorPractice();  // Creating Object  ---> Note:- 
		
		V.phas();                 // Calling non-static method --> Object.MethodName
		
	}
	
    // Constructor method    ----> Name of construct is always as class name
	public ContructorPractice()       // User define constructor
	{
		 a=20;    // To Initialize / Assign the value
		 b=20;
		
		System.out.println("This is User define constructor");
	}
	
	
	// Non-Static method
	public void phas()
	{
		
		int c=a+b;  // Assign the value for variables
		System.out.println("The sum of a and b is "+c);
		
		
	}
	
	
	
}
