package GeneralisationStudy;

public class Banking_Data {

	public static void main(String[] args) {
		
		
		SBI sb=new SBI();
		BOI b=new BOI();
		
		sb.loan();
		sb.tranfer();
		sb.transaction();
		sb.offer();  // it's own method
		
		
		b.loan();
		b.tranfer();
		b.transaction();
		b.Extrafeatures();  // it's own method

		 double d=145.76435;
		 System.out.println(d);
		int c=(int) d;
		System.out.println(d);
		
	}

}
