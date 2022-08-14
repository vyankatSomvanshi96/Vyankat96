package Inheritance;

public class Hierachicalinheritance {

	public static void main(String[] args) {
		
		classB bs=new classB();  // Create object for class B
		
		bs.testA();  // Calling parents class using sub-class B object
        bs.testB();  // Calling own class
        
		
        // Static method
        classB.tsA();  // Calling parents method
        classB.tsB();  // calling it's own method
        
        
        
        classC cs=new classC();   // // Create object for class C
        
        cs.testA();     // Calling parents class using sub-class C object
        cs.testC();     // Calling own class
        
        // Static method
        classC.tsA();    // Calling parents method
        classC.tsC();   // calling it's own method
        
        
	}

}
