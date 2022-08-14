package thisUse;

public class B {

	int a=10;   // declare as globle variable
	
	
	public static void main(String[] args) {
		
      B n=new B();
      n.ts();
		
	}

	public void ts()
	{
		int a=50;  // declare as local variable
		int sum=10+a;
		System.out.println("Use local varible "+sum);  // use local variable
		
		int sum1=100+this.a;
		System.out.println("Use globle variable by using 'this' keyword "+sum1);
	}
	
	
}
