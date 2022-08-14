package InterfaceStudy;

public interface Father {

	void money();
	void attitude();
	
	
	default void love()   // Declared same method in father & mother
	{
		System.out.println("Father Love");
	}
	
	static void beh1()  // Static Method
	{
		System.out.println("Static method from Father interface");
	}
	
}
