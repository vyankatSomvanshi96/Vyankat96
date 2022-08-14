package UseGlobleVariable;

public class Recall {

	public static void main(String[] args) {

		globlestd vynk=new globlestd();  // Object creating for globlestd class
		
		
		
		vynk.name="Vyankat";     // Assign the variable
		vynk.age=25.5f;
		vynk.emp_ID="PU1234";
		vynk.gender='M';
		vynk.salary=47.89f;
		
		vynk.Emp_Info();   // Calling non-static method from another class
		
		
		globlestd vyanki=new globlestd();   //Creating new module for using same globle variable
		
		vyanki.age=24.8f;
		vyanki.emp_ID="MT1232";
		vyanki.gender='M';
		vyanki.name="Somvanshi";
		vyanki.salary=48.9f;
		
		vyanki.Emp_Info();  // Calling non-static method from another class 
		
		
		// use control statement
		
		int marks=90;
		if(marks>40);
		{
			System.out.println("I am pass");
		}
		
		
		
		float weight=65.5f;
		if (weight>70)
		{
			System.out.println("weight under control");
		}
		else 
		{
          System.out.println("Need to follow diet");
		}
		
		
		
	}

	 
	
	
}
