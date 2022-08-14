package UpcastingStudy;

public class Up_Casting_study {

	public static void main(String[] args) {

     Son s=new Son();  // Object create for Son 
     s.home();
     s.money();
     s.degree();  // Calling Son's own method
     System.out.println("--------------------");
     
     Father f=new Father();   // Object create for Father
     f.money();
     f.home();
     System.out.println("--------------------");
     
     Father s1=new Son();  // Creating object of Son's with giving Reference of Father's class ---> It means s1 is object of Son's class
     s1.money();     // In this case we are able to call only those methods which are declared with same name in both classes
     s1.home();     // It means, Method money and home are declared in Father as well as in Son's class
     
     // s1.degree();-----> Can't call Son's own method in Up-Casting
		

	}

}
