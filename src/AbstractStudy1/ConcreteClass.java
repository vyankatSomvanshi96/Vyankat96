package AbstractStudy1;

public class ConcreteClass extends ClassA {

	public static void main(String[] args) {
		
		
		ConcreteClass vv=new ConcreteClass();
		
		vv.pl1();
		vv.pl2();
		vv.pl3();
		vv.pl4();

	}

	@Override
	public void pl3() {

    System.out.println("Incomplete method 3 completing in this class");
		
	}

	@Override
	public void pl4() {
	
		System.out.println("Incomplete method 4 completing in this class ");
		
	}

}
