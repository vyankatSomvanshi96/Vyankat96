package LogicalPrograms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//String int float char
		
		System.out.println("Please enter the 1st number number");
		int number1 = sc.nextInt();
		
		System.out.println("Please enter the 2nd number number");
		int number2 = sc.nextInt();
        
		int sum=number1+number2;
		
		System.out.println("Addition of two numbers is"+sum);
		

	}

}
