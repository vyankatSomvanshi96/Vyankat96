package ContuctorWithParameters;

public class Contructt {

	int a;     // Globally Variable declaration
	int b;
	int c;
	
	public static void main(String[] args) {
		
       Contructt vm=new Contructt();     // Create object for constructor without parameters
		vm.sapmle();
		
		Contructt v=new Contructt(70);    // Create object for constructor with parameters one
		v.sapmle();
		
		Contructt vv=new Contructt(20, 20);    // Create object for constructor with parameters Two
		vv.sapmle();
		
		Contructt vs=new Contructt(10, 10, 10);    // Create object for constructor with parameters Three
		vs.sapmle();
		
		
				
	}

	public Contructt()     // Create Constructor without parameters
	{
		a=20;  // Assign value
		b=30;
	}
	
	public Contructt(int x)  // Create Constructor with parameters one
	{
		  a=x;  // Default value of b and c is zero
	}
	
	public Contructt(int x, int y)   // Create Constructor with parameters two
	{
		a=x;
		b=y;   // Default value of c is zero
    }
	
	public Contructt(int x, int y, int z)   // Constructor with parameters three
	{
		a=x;
		b=y;
		c=z;
		
	}
	
	public void sapmle()     // Non Static Method
	{
		int add=a+b+c;
		System.out.println("The sum od a and b is "+add);   // Usage
	}
	
	
	
}
