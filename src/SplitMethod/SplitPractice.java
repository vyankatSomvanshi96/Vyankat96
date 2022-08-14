package SplitMethod;

public class SplitPractice {

	public static void main(String[] args) {
		
		
		String name="Vyankat Kant Somvanshi";
		
		String names[] = name.split(" ");
		
		for(int v=0; v<=2; v++)
		{
			System.out.println(names[v]);
		}

		
		for(int s=2; s>=0; s--)
		{
			System.out.println(names[s]);
		}
		
		// 2nd Example
		
		String vks="Vyanki_Bhai_from_Dharashiv";
		
		String address[] = vks.split("_");
		
		for(int s=0; s<=3; s++)
		{
			System.out.print(address[s]+" ");
		}
		
		
		
		
		
		
	}

}
