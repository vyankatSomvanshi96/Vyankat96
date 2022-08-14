package InterfaceStudy;

public class ForPracticeClass implements ForPractice1 , ForPractice2 {

	public static void main(String[] args) {
		

		ForPracticeClass vv=new ForPracticeClass();
		
		vv.vs();
		
	}

	@Override
	public void sv1() {
		
		
	}

	@Override
	public void sv2() {
		
		
	}

	@Override
	public void vs()   // Diamond ambiguity Problem
	{
		ForPractice1.super.vs();   // ClassName.super.MethodName
		ForPractice2.super.vs();
	}

	@Override
	public void vs2() {
		
		
	}

	@Override
	public void vs3() {
		
		
	}

}
