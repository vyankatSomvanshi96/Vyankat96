package ArrayStudy;

public class ArrayUse {

	public static void main(String[] args) {
		
		String city[]=new String[5];

		city[0]="pune";
		city[1]="Goa";
		city[2]="Thane";
		city[3]="Dhule";
		city[4]="Nanded";
						
		for(int v=0; v<=3; v++)    // (1.Initialization; 2.Condition; 3.Updation)
		{
			System.out.println(city[v]);
		}
		System.out.println("===");
		System.out.println("Decending Order");
		for(int s=3; s>=0; s--)
		{
			System.out.println(city[s]);
		}
		
		System.out.println(city.length);
		
		System.out.println("Assending Order");
		
		for(int d=0; d<=city.length-1; d++)
		{
			System.out.println(city[d]);
		}
		
		
		System.out.println("Decending Order");
		
		for(int h=city.length-1; h>=0; h--)
		{
			System.out.println(city[h]);
		}	
		System.out.println("===========");
		
		// 2nd Example
		int no[]= {1,2,3,4,5,6};  //  Declaration + Initialization
		
		System.out.println(no[4]);
		
		for(int v=0; v<=no.length-1; v++)
		{
			System.out.println(no[v]);
		}
		System.out.println("====");
		
		for(int c=no.length-1; c>=0; c--)
		{
			System.out.println(no[c]);
		}
		
		// 3rd Example
		char name[]=new char[4];
		for(char c=0; c<=name.length-1; c++)
		{
			System.out.println(name[c]);
		}	
		
		char vs[]= {'a', 'b', 'c'};
		
		System.out.println(vs.length);
		
		}

}
