
public class polymorphis {

	public static void main(String[] args) {
		

		polymorphis vv=new polymorphis();
		vv.plan();
		vv.plan(20);
		vv.plan(20, 20);
		vv.plan(20, 20, 20);
		// Overloading
		
				
	}

	
	public void plan()   // Declared all method with same name with different parameters
	{
		
	}
	
	public void plan(int a)
	{
		int sum=10+a;
		System.out.println("One parameters "+sum);
	}
	public void plan(int a, int b)
	{
		int sum=a+b;
		System.out.println("Two parameters "+sum);
	}
	
	public void plan(int a, int b, int c)
	{
		int sum=a+b+c;
		System.out.println("Three parameters "+sum);
	}
}
