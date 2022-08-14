package Inheritance;

public class multiInheritance {

	public static void main(String[] args) {
		
		//Calling Non-Static method
		son g=new son();    // Create object of son Class
		g.gm();           // using son object calling GrandMother method
		g.pl("Vyanki",'M', 25.3f);  // using son object calling mother method
		g.plan();     //// using son object calling it's own method
		
		
		son.gmm();
		son.ps();
		son.pn();

	}

}
