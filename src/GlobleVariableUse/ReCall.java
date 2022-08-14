package GlobleVariableUse;

import ParaemeterStuty.Recalls;

public class ReCall {

	int x=10;
	int y=25;
	static int z=12;
	static int g=12;
	int sum=x+y;
	int add=x+y+z;
	
	
	public static void main(String[] args) {
		
		ReCall v=new ReCall();
		
		System.out.println("sum of xy is "+v.sum);
		System.out.println(z);
		System.out.println(v.add);
		
		v.add();
		
		
		sub();
	}

	
	public void add()
	{
		System.out.println("sum of xy is "+sum);
		System.out.println(z);
		System.out.println(add);
	}
	
	public static void sub()
	{
		int j=z-g;
		System.out.println(j);
		
	}
}
