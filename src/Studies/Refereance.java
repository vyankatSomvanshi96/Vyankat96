package Studies;

public class Refereance {

	public static void main(String[] args) {
		
		Primitiv.plan();  // Static method calling from another class(Primitiv)--->ClassName.MethodName
		
		//Non-Static method
		
		Primitiv k=new Primitiv();  // Create object ---> ClassName ObjectName=new ClassName
		k.Nplan();                  // Calling Non-Stc method from another class ---> ObjectNmae.MethodeName=new ClassName
		
		
	}

}
