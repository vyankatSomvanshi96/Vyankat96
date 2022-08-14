package LogicalPrograms;

public class ReverseNumberWithoutStringConvert {

	public static void main(String[] args) {
		
		int number=123;
		int revNum=0;
		
		for(int i=number; i>0; i=i/10)
		{
			int rem = i%10;
			revNum=revNum*10+rem;
		
		}
		System.out.println(revNum);

	// 2nd example	
		int num2=123456;
		int rm=0;
		
		for(int i=num2;i>0;i=i/10)
		{
			int rs = i%10;
			rm=rm*10+rs;
		}
		System.out.println(rm);
		
		
		
		
		
		
		
		
		
	}

}
