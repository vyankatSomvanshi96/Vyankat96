package InterFcDiamond;

public interface sample2 {

	
    default void value()
    {
    	System.out.println("This is sample2 value method");
    }
	
	default void time()
	{
		System.out.println("This is sample2 time method");
	}
}
