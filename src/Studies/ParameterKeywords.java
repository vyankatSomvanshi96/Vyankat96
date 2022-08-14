package Studies;

public class ParameterKeywords {

	public static void main(String[] args) {
	 // static Method	
     d("vyankat", 30, 'M');  //  calling static method in same class for keywords
     d("Mona", 29, 'F');    // calling static method in same class for multiple time
     
     
     ss("VYanki", 'V');
     ss("Som", 'S');
     
     
     // Non-static method
     ParameterKeywords vm=new ParameterKeywords();
     vm.c("Somvanshi", 'M', 22.7f);
     vm.c("Mone", 'F', 66.2f);
     vm.c("VS", 'G', 33.5f);
     
	}

	public static void d(String name, int a, char c)
	{
		name="vyankat";
		a=30;
		c='M';
		System.out.println("My name is "+name);
		System.out.println("My roll no is "+a);
		System.out.println("My gender is "+c);
		
	}
	
	public void c(String vel, char g, float my)
	{
		vel="Somvanshi";
		g='F';
		my=22.7f;
		System.out.println("==================");
		System.out.println("Non static");
		System.out.println(vel);
		System.out.println(g);
		System.out.println(my);
		
	}
	
	
	
	public static void ss(String nm, char g)
	{
		System.out.println(nm);
		System.out.println(g);
	}
	
	
}
