package ContuctorWithParameters;

public class NonStatic {

	public static void main(String[] args) {
		
      NonStatic v=new NonStatic();
      v.sam("Vyankat", 96, 'M', 100.3f);
		
		
	}

	public void sam(String pan, int a, char gender, float speed )
	{
		System.out.println("My Name is "+pan);
		System.out.println("My Roll no is "+a);
		System.out.println("My gender is "+gender);
		System.out.println("My bike speed is "+speed);
		
	}
	
	
	
	
}
