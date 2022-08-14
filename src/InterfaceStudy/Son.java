package InterfaceStudy;

public class Son implements Mother, Father {

	public static void main(String[] args) {
		Son vd=new Son();  // Object create 
		vd.look();
		vd.nature();
		vd.money();
		vd.attitude();
        vd.love();
        
        Father.beh1();  // Calling Static method by using ClassName.MethodName();  ---> Same Method Name
        Mother.beh1();   // Calling Static method by using ClassName.MethodName();  ---> Same Method Name
	}

	@Override
	public void money() 
	{
		System.out.println("Father's method completing here");		
	}

	@Override
	public void attitude() 
	{
		System.out.println("Father's method completing here");
	}

	@Override
	public void look() 
	{
	 System.out.println("Mother's method completing here");		
	}

	@Override
	public void nature()
	{
		System.out.println("Mother's method completing here");		
	}

	@Override
	public void love()   // Diamond Ambiguity Problem solved
	{
		Mother.super.love();  // We can call with use of syntax ClassName.super.MethodName in case of Same Method Name in interface
		Father.super.love();  // We can call with use of syntax ClassName.super.MethodName in case of Same Method Name in interface
	}

}
