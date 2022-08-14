package abstractStudy;

public class ClassD extends ClassC {

	public static void main(String[] args) {
		

		ClassD vs=new ClassD();
		vs.plan2();
		vs.plan();
		
	}

	@Override
	public void plan2() {
		System.out.println("Incomplete method completing in this concret class");
		
	}

}
