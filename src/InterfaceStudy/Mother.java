package InterfaceStudy;

public interface Mother {

	void look();
	void nature();
	
	
	   default void love()  // Declared same method in father & mother
	{
		System.out.println("Mother's Love");
		
	}
	
	static void beh1()  // Static Method
	{
		System.out.println("Static method from mother interface");
	}
}
