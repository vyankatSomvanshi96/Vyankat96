package LogicalPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter name");
		
		String name = sc.next();
		String r="";
		
		for(int i=name.length()-1; i>=0;i--)
		{
			r=r+name.charAt(i);
		}
		
		System.out.println("Reverse string is "+r);

	}

}
