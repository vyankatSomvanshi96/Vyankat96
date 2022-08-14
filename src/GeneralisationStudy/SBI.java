package GeneralisationStudy;

public class SBI implements RBI {

	@Override
	public void loan() {
		System.out.println("loan intrest of SBI is 7 to 9 % ");
		
	}

	@Override
	public void transaction() {
		System.out.println("Only 5 times transactions are free per day after that Rs 15 charge for every transaction");
		
	}

	@Override
	public void tranfer() {
		System.out.println("Can tranfer 1Lakh per day");
		
	}

	
	public void offer()
	{
		System.out.println("every 10K transactions will be got Scratch card ");
	}
	
}
