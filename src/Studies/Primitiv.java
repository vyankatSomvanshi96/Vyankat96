package Studies;

public class Primitiv {

	public static void main(String[] args) {
		
     plan();  // static method calling from same class ---> MethodName();
		
	 Primitiv j=new Primitiv();  // Create object ---> ClassName ObjectName=new className();
	 j.Nplan();                  // Calling Non-static method from same class ---> ObjectName.MethodName();
     
    
     
	}

	// Static method
	
	public static void plan()  // Method name is always with opening & closing round bracket
	{
		System.out.println("Hey dear this side vyankat");
	}
	
	
	// Non-Static Method
	public void Nplan()
	{
		
		System.out.println("Hey Baby");
		
	}
	
}
