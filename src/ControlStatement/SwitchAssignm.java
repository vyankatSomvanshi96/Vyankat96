package ControlStatement;

public class SwitchAssignm {

	public static void main(String[] args) {
		// Grade A--->if i got >=90
       // Grade B---> if i got >=67
		// Grade C---> if i got >=50
		// Grade D---> If i got >=40
		
		char grade='B';
		
		switch (grade) 
		{
		
		case 'A': System.out.println("If I got >=90");
		break;

		case 'B': System.out.println("If I got >=67");
		break;
		
		case 'C': System.out.println("if i got >=50");
		break;
		
		case 'D': System.out.println("If i got >=40");
		break;
		
		
		default: System.out.println("Plz enter valid grade");
		break;
		}
		
		
		}

}
