package GlobleVariableUse;

import UseGlobleVariable.Recall;

public class GlobleStudies {

	int a=20;   // Non-Static Globle variable  (Declaration + Assign the value)
	static int b=10;  // Static Globle variable  (Declaration + Assign the value)
	static int c=5;
	
	
	public static void main(String[] args) {

    GlobleStudies v=new GlobleStudies();  // create object for calling globle non-static variable
	System.out.println("Calling Non-Static globle variable "+v.a);	  // calling non-static globle variable ----->   (object.variable)
	System.out.println("Calling static variable "+b);	  // calling static globle variable  ------>   (variable)
	
	int sum=10+v.a;
	int subs=20-b;	
	
	System.out.println("The sum is "+sum);
	System.out.println("The sub is "+subs);
	
	test();     // Calling Static method using globle variable for same class
	
	GlobleStudies vs=new GlobleStudies();   // Create object
	vs.test1();                             // Calling non-static method for same class ----> ObjectName.MethodName
	
	
	ReCall v1=new ReCall();    // Create object for another class
	v1.add();                 // Calling Non-Static from another class

	ReCall.sub();            // Calling Static from another class  ----->  ClassName.MethodName
	
	System.out.println("===== ======");
      int sums=ReCall.g+ReCall.z;    // Calling globle variable from another class for Static variable ----> ClassName.Variable
      System.out.println(sums);
      
      int sm=v1.y/v1.x;        // Call globle variable from another class for Non-Static variable ----> ObjectName.VariableName
      System.out.println(sm);
	
	}

	public static void test()
	{
		int d=c+b;
		System.out.println("==== static data ====");
		System.out.println(d);
	}
	
	public void test1()
	{
		int sum=a+b+c;
		System.out.println("====non-Static data====");
		System.out.println("The sum of abc is "+sum);
		
	}
}
