package Inheritance;

public class mother extends grandMother {

	
	public void pl(String name, char grade, float age)
	{
		name="Vyankat";
		 grade='M';
		age=25.5f;
		
		System.out.println("My name is "+name);
		System.out.println("I'm "+grade);
		System.out.println("My age is "+age);
		
	}
	
	public static void ps()
	{
		int a=34;
		int b=34;
		int sum=a+b;
		System.out.println("The sum of a and b is "+sum);
	}
	
	
}
