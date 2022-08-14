package MultiDiamPatternArrayStdy;

public class MultiDiaStudy {

	public static void main(String[] args) {
		
	//	String vs[][]=new String[2][3];
		int vks[][]=new int[4][3];
		
		vks[0][0]=1;
		vks[0][1]=2;
		vks[0][2]=3;
		vks[1][0]=4;
		vks[1][1]=5;
		vks[1][2]=6;
		vks[2][0]=7;
		vks[2][1]=8;
		vks[2][2]=9;
		vks[3][0]=10;
		vks[3][1]=11;
		vks[3][2]=12;
		
		
	//	System.out.println(vks);
		
		for(int i=0; i<=3;i++)   // Outer For loop for Row
		{
			for(int j=0; j<=2;j++)   // Inner For loop for Column
			{
				System.out.print(vks[i][j]+" ");
			}
			System.out.println();
		}
		
	    
		
		
		

	}

}
