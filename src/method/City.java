package method;

public class City {

	public static void main(String[] args) {
		// To call non-static method we need to create object, below is a syntax to create object.
		
		// Syntax--->>> ClassName ObjectName=New ClassName();
		
		City pune = new City();  // pune is a object name
		
		// How to call Non-Static Method
		// Syntax---->>> objectName.MethodName();
		
		pune.swargate();  // calling non-static method from same class.
		
		katraj();   // calling static method from same class.
		
		
	
	}

	public static void katraj() //static method
	{
		System.out.println("katraj is a static method from city class");
	}
	public void swargate() //Non-static method
	{
		System.out.println("swargate is a non-static method from city class");
	}
	
}
