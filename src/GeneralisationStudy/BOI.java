package GeneralisationStudy;

public class BOI implements RBI {

	@Override
	public void loan() 
	{
		System.out.println("loan intrest of BOI is 8 to 10 %");
	}

	@Override
	public void transaction()
	{
		System.out.println("Only 3 times transactions are free per day after that Rs 15 charge for every transaction");
	}

	@Override
	public void tranfer() 
	{
		System.out.println("Can tranfer 1Lakh per day");
	}

	public void Extrafeatures()
	{
		System.out.println("0% loan intrest on home loan");
	}
	
}
