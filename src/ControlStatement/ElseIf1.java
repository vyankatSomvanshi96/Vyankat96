package ControlStatement;

public class ElseIf1 {

	public static void main(String[] args) {
		// if its summer then its very hot
		
		String season="summer";
		if (season=="summer") 
		{
			System.out.println("its very hot");
		} 
		else if (season=="rainy")
		{
            System.out.println("its raining heavily");
		}
		
		else if (season=="winter")
		{
			System.out.println(season=="winter");
		}
	}

}
