package AccessSpe;

public class CallingClass {

	public static void main(String[] args) {


		acess vs=new acess();
		
		vs.subs();  //Default method
		vs.mul();  // Protected method
		vs.div();  // Public method
		
		System.out.println(vs.a);
		System.out.println(vs.c);
		System.out.println(vs.d);

	}

}
