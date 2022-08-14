package AccessSpe;

public class acess {

	
	int a=20;
	private int b=20;
	protected int c=30;
	public int d=40;
	
	
	public static void main(String[] args) {
		
		acess vs=new acess();
		vs.sum();
		vs.subs();
		vs.mul();
		vs.div();
		
		System.out.println(vs.a);
		System.out.println(vs.b);
		System.out.println(vs.c);
		System.out.println(vs.d);
		
		}

	private void sum()
	{
		int a,b=10;
		int c=10;
		 a=c+b;
		System.out.println("This is privete method "+a);
	}
	
	void subs()
	{
		int a=2;
		int b=3;
		int sub=a*b;
		System.out.println("This is default method "+sub);
	}
	
	protected void mul()
	{
			System.out.println("This is protected method");
	}
	
	public void div()
	{
		System.out.println("This is public method");
	}
	
	
}
