package InterfaceStudy;

public class ClassInterFc implements Interfc {

	public static void main(String[] args) {
		
    ClassInterFc vv=new ClassInterFc();
    
    vv.pl();
    vv.pl1();
    vv.plan();
   	}

	@Override
	public void pl() {
		System.out.println("Incomplete method completing in this class");
		
	}

	@Override
	public void pl1() {

		System.out.println("Incomplete method completing in this class");
		
	}

	public void plan()
	{
		System.out.println("It's own method");
	}
	
}
