package AssigmStaticAndNonStc;

public class StudendInfoUpd {

	public static void main(String[] args) {
		
		
		cas("VS", 'M', 25.6f, 66.7f,99);  // calling static method from same class with parameters
		cas("VS", 'M', 24.5f, 77.6f, 91);  // use same variable in N'th number of time
		
       cs();                             // calling static method from same without parameters
	}

	public static void cas(String name, char gender, float age, float weight, int rollno)  // Static with parameters
	{
		
		// Usage
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(rollno);
		
	}
	
	public static void cs()                     // Static without parameters
	{
		String name;
		float age;
		float weight;
		char gender;
		int rollno;
		
		name="Vyanki";
		age=25.4f;
		weight=65.3f;
		gender='M';
		rollno=96;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(gender);
		System.out.println(rollno);
		
		System.out.println(name);
		System.out.println();
					
		}
			
}
