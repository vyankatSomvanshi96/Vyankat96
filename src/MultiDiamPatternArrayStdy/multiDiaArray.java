package MultiDiamPatternArrayStdy;

public class multiDiaArray {

	public static void main(String[] args) {
		
		// Array Declared with use of new keyword
		char a[][]=new char[2][3];  // Array with new keyword --> [2] is for Row And [3] is for column
        
		// Initialization
		a[0][0]='A';
		a[0][1]='B';
		a[0][2]='C';
		a[1][0]='D';
		a[1][1]='E';
		a[1][2]='F';
		
		// Usage
		
		// 1st Way of Calling
		System.out.print(a[0][0]+" ");
		System.out.print(a[0][1]+" ");
		System.out.println(a[0][2]+" ");
		System.out.print(a[1][0]+" ");
		System.out.print(a[1][1]+" ");
		System.out.println(a[1][2]+" ");
		System.out.println("=====");
		
		
		// 2nd way of Calling
        for(char b=0; b<=1; b++)    // Outer For loop for Row
        {
        	for(char c=0; c<=2; c++)   // Inner For loop for Column
        	{
        		System.out.print(a[b][c]+" ");
        	}
        	System.out.println();
        }
        
        
        // Without use of new keyword
        
		System.out.println("Without use of new keyword");
		
		char v[][]= {{'A', 'B', 'C'},{'D', 'E', 'F'}};  // --> without new
		
		for(char h=0; h<=1; h++)   // Outer For loop for Row
		{
			for(char j=0; j<=2; j++)  // Inner For loop for Column
			{
				System.out.print(v[h][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("============");
		
		// 2nd Example
		
		// Array Declaration
		String s[][]=new String[4][4];		
		
		// Initialization
		
		s[0][0]="Pooja";		
		s[0][1]="Mayuri";
		s[0][2]="Sayli";
		s[0][3]="Priyanka";
		s[1][0]="Manali";
		s[1][1]="Dipali";
		s[1][2]="Neha";
		s[1][3]="Bhagu";
		s[2][0]="Kajal";
		s[2][1]="Dhanu";
		s[2][2]="Asmita";
		s[2][3]="Piu";
		s[3][0]="Trisha";
		s[3][1]="Sandhya";
		s[3][2]="Manali Aunty";
		s[3][3]="Soni";
		
		// Usage with first way
		System.out.println("With use of new keyword");
		
		System.out.print(s[0][0]+" ");
		System.out.print(s[0][1]+" ");
		System.out.print(s[0][2]+" ");
		System.out.println(s[0][3]+" ");
		System.out.print(s[1][0]+" ");
		System.out.print(s[1][1]+" ");
		System.out.print(s[1][2]+" ");
		System.out.println(s[1][3]+" ");
		System.out.print(s[2][0]+" ");
		System.out.print(s[2][1]+" ");
		System.out.print(s[2][2]+" ");
		System.out.println(s[2][3]+" ");
		System.out.print(s[3][0]+" ");
		System.out.print(s[3][1]+" ");
		System.out.print(s[3][2]+" ");
		System.out.println(s[3][3]+" ");
		System.out.println("===");
		
				
		// Usage with Second way
		
		for(int k=0; k<=3; k++)
		{
			for(int l=0; l<=3; l++)
			{
				System.out.print(s[k][l]+" ");
			}
			System.out.println();
		}
		
		System.out.println("======A======");
		
		
		
		// Taking same example without use of new keyword
		
		System.out.println("without use of new keyword");
		
		String r[][]= {{"Pooja", "Mayuri",  "Sayli",  "Priyanka" },{"Manali", "Dipali", "Neha", "Bhagu"},{"Kajal", "Dhanu", "Asmita", "Piu"},{"Trisha", "Sandhya", "Manali Aunty", "Soni"}};
		
		for(int t=0; t<=3;t++)
		{
			for(int y=0; y<=3; y++)
			{
				System.out.print(r[t][y]+" ");
			}
			System.out.println();
		}
		System.out.println("====");
		
		// 3rd Example
		
		int rollN[][]= {{1},{2,3},{4,5,6}};
		for(int o=0; o<=2; o++)
		{
			for(int p=0; p<=o; p++)
			{
				System.out.print(rollN[o][p]+" ");
			}
			System.out.println();
		}
		System.out.println("====");
    //    char vl[][]=new char[2][2];
	    char vs[][]=new char[2][2];
	    vs[0][0]='x';
	    vs[0][1]='y';
	    vs[1][0]='z';
	    vs[1][1]='a';
	    
	    System.out.print(vs[0][0]+" ");
	    System.out.println(vs[0][1]+" ");
	    System.out.print(vs[1][0]+" ");
	    System.out.println(vs[1][1]+" ");
	    
	  //  System.out.println("========");
	    
	    
	    for(char i=0; i<=1; i++)
	    {
	    	for(char u=0; u<=1; u++)
	    	{
	    		System.out.print(vs[i][u]+" ");
	    	}
	    }
	    System.out.println();
		
		
	}

}
