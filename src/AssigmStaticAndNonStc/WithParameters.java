package AssigmStaticAndNonStc;

public class WithParameters {

	public static void main(String[] args) {
		
		
		
		cas1("Vyankat", 'M', 25.5f, 65.6f, 96);
		
		cas1("Mona", 'F', 25.7f, 49.6f, 99);
		
		cas1("Vyanku", 'M', 25.5f, 65.8f, 95);
		
		StudendInfoUpd.cas("vs", 'M', 25.4f, 45.5f, 77);  // Calling Static method from another class (ClassName.MethodName)
		
		
		StudendInfo vv=new StudendInfo();  // Create Object of StudentInfo class
		vv.ph(23, 23, 4);   // Calling Non-Static Method from another class
	}
	public static void cas1(String name, char gender, float age, float weight, int rollno)
	{
		
		
		System.out.println(name);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(rollno);
		
		
	}
	
	
}
