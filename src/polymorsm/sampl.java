package polymorsm;

public class sampl {

	public static void main(String[] args) {


		sampl vv=new sampl();
		vv.test();
		vv.test(5);
		vv.test(5, 5);

	}
	public void test()
	{
		System.out.println("Zero parameters");
	}
	
	public void test(int a)
	{
		
		System.out.println("One parameters"+a);
	}

	public void test(int a, int b)
	{
		
	    int sum=a+b;
		System.out.println(sum);
	}
}
