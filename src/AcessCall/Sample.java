package AcessCall;

import AccessSpe.acess;

public class Sample extends acess {

	public static void main(String[] args) {
		

		acess vv=new acess();
		vv.div();
		
		
		Sample vm=new Sample();
		vm.div();   // This is public method
		vm.mul();  // This is protected method
		
	}

}  
