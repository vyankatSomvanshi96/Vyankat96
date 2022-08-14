
public class Son extends Father {

	public static void main(String[] args) {


		Son ss=new Son();
		Father fs=new Father();
		
		ss.phs();
		fs.phs();  //Overriding
	}

	public void phs()
	{
		System.out.println("This is Son's property");
	}
}
