package LogicalPrograms;

public class ReverseTheNumber {

	public static void main(String[] args) {
		
		int number= 123456;
		
		String s = Integer.toString(number);
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		int revNumber = Integer.parseInt(r);
		
		System.out.println("Original number is"+number);
		System.out.println("Rev number is "+revNumber);

	}

}
