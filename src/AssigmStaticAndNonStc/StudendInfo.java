package AssigmStaticAndNonStc;

import java.lang.ProcessHandle.Info;

public class StudendInfo {

	public static void main(String[] args) {
		
		// Non Static method with parameters in same class
	StudendInfo VM=new StudendInfo();
	VM.info("Vyankat", 25.6f, 'M', 65.7f, 96);
	
   
   VM.ph(10, 40, 5);
   VM.ph(10, 10, 10);
	
	// Non static without parameters in same class
   StudendInfo ss=new StudendInfo();
   ss.ns();
   
   
	}

    public void info(String name, float age, char gender, float weight, int rollno)     // Non-Static with parameters for keywords
    {
    	
    	System.out.println("====================");
    	System.out.println("My name is "+name);
    	System.out.println("My age is "+age+" years");
    	System.out.println("My gender is "+gender);
    	System.out.println("My weight is around "+weight+" KG");
    	System.out.println("My roll number was in class is "+rollno);
    	
        }
	
		public void ph(int c, int d, int f)    // Non static with parameters for add, subs, multiply,division
		{
			int add=c+d+f;
			System.out.println("===========");
			System.out.println("The addition of cdf is "+add);
		}
		
		public void ns()     // Non Static method without parameters
		{
			String name;
			float age;
			char gender;
			float weight;
			int rollno;
			
			name="Vyankat";
	        age= 29.9f;
	    	gender='F';
	    	weight=55.7f;
	    	rollno=21;
			
	    	System.out.println(name);
	    	System.out.println(age);
	    	System.out.println(gender);
	    	System.out.println(weight);
	    	System.out.println(rollno);
	    	}
	
	
	
	
	
	
	
	
	
	
	
	
}
