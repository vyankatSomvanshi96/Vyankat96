package abstractStudy;

public class CC extends A {

	public static void main(String[] args) {
		CC vv=new CC();
		vv.test1();
		vv.test2();
		vv.test3();
		vv.test4();
	}

	@Override
	public void test3() 
	{
		System.out.println("Completing incomplete method from abstract class in concrete class");
		
	}

	@Override
	public void test4()
	{
		System.out.println("Completing incomplete method from abstract class in concrete class");				
	}

}
