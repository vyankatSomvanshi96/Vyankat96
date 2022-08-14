package InterFcDiamond;

public class ClassSample implements sample1,sample2 {

	public static void main(String[] args) {
		

		ClassSample vs=new ClassSample();
		
		vs.value();
		vs.time();
	}

	@Override
	public void value()
	{
		sample1.super.value();
		
		sample2.super.value();
		
	}

	@Override
	public void time()
	{
		sample1.super.time();
		sample2.super.time();
		
	}

}
