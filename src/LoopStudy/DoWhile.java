package LoopStudy;

public class DoWhile {

	public static void main(String[] args) {
		
		int a=4;    // Initialization
		
		do
		{
			System.out.println(a);
			a=a+4;    // Updation
			
		}
		while (a<=40);  // condition

		
		System.out.println("=========");
		
		
		int b=40;
		do 
		{
			System.out.println(b);
			
			b=b-4;
		} 
		while (b>=4);
		
		
		
		float h=50f;
		do
		{
			System.out.println(h);
			h=h-2.5f;
		} while (h>=2.5);
		
		
		int k=2;
		do 
		{
			System.out.println(k);
			k=k+2;
			
		} while (k<=20);
		
		
		System.out.println("=====");
		int p=20;
		do 
		{
			System.out.println(p);
			p=p-2;
			
		} while (p>=2);
		
		
		
		
	}

}
