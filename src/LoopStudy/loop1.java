package LoopStudy;

public class loop1 {

	public static void main(String[] args) {
		// In Loops we have to follow this three steps..
		
		// Initialization
		// condition
		// updation
		
		
		// i want to write table of 3
		
		for (int a=3; a<=30; a=a+3)
		{
			System.out.println(a);
		}
		
		
		// if i want to print 10th time ---->      1--->5
		
		for(int b=1; b<=5; b++)
		{
			System.out.println(10);
		}
		
		
	
		
		// decision making statement
		
		// if user I'D is correct then please enter pass
		// If Pass is correct then login successfully
		// if invalid pass then login Failed
		// enter valid user I'D
		
		String UD="Vyankat2013";
		String pass="8975VS";
		
		if (UD=="Vyankat2013")
		{
			System.out.println("Correct UD, Please enter pass");
			
			if(pass=="8975VS")
			{
				System.out.println("Login Successfully");
			}
			else
			{
				System.out.println("Please enter valid pass");
			}
			
			
		}
				
		else
		{
               System.out.println("Invalid UD, Please enter valid UD");
		}
		
		
	}

}
