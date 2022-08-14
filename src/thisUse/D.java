package thisUse;

public class D extends C {

	int b=10;   // Declare globally
	
	public static void main(String[] args) {
		
    D vs=new D();
    vs.plan();
		
		
	}

	public void plan()
	{
		int b=2;  // declare local
		
		System.out.println("Calling local variable "+b);
		System.out.println("Calling gloable variable in same class using this "+this.b);
		System.out.println("Calling gloable variable in super class using super "+super.b);   // Calling globle variabvle from another class
	}
	
	
	
}
