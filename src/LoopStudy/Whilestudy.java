package LoopStudy;

public class Whilestudy {

	public static void main(String[] args) {
		
		// Incremental by using while loop
		int a=4;      // Initialization
		while (a<=40)   // Condition
		
		{
			System.out.println(a);
			
			a=a+4;   // Updation  --------> 
			
		}
		
		System.out.println("===============");
		
		
		// Decremental by using while loop
		int c=40;
		while (c>=4)
		{
			System.out.println(c);
			c=c-4;
				
		}
		
		
		// Incremental by using for loop
		
		System.out.println("==============");
		for(int b=5; b<=50; b=b+5)	
		{
			System.out.println(b);
		}
			
		System.out.println("===========");
		
		// Decremental by using for loop
		
		for(int d=50; d>=5; d=d-5)
		{
			System.out.println(d);
			
		}
	}

}
