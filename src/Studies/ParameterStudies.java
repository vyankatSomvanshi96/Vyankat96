package Studies;

public class ParameterStudies {

	public static void main(String[] args) {
		
		place(6, 5);   // calling static method in same class for parameter type
		
		place(2, 7);
		
		
		
		ParameterStudies vs=new ParameterStudies();   // create object 
		
		vs.phase(9, 3, 4);  // calling Non-static method in same for parameter type
		vs.phase(7, 2, 1);
	}

	
	public static void place(int a, int b)
	{
		
		int addition=a+b;
		System.out.println("the addition is "+addition);
	}
	
	
	public void phase(int x, int y, int z) 
	{
		int subs=x-y-z;
		
		System.out.println("The subs of x-y-z is "+subs);
	}
	
	
	
}
