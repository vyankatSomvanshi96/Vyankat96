package Inheritance;

import java.sql.PseudoColumnUsage;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		
		mother vs=new mother();  // Object create for test1
		
		son sv=new son();  // object create for test2	
		
		// Non-static method	
		vs.pl("Vyankat", 'M', 25.7f);	
		
		sv.plan();
		
		sv.pl("Vynki", 'F', 25.2f);
		
		// Static method
		System.out.println("==========");
		mother.ps();
		son.pn();
		son.ps();
		
		
	}

}
