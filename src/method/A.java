package method;

public class A {

	public static void main(String[] args) {
		
		// To create object follow syntax
		
		// Syntax---->>>  className objectName = new className();
		
		A x = new A();
		
		// to call non static method from same class 
		//syntax---->> objectName.methodName();
		
		x.method1();
		
		// to call non static method from another class--->> create of an object of that class
		// to call swargate method from City class,  we need to create object of city class
		
		City mumbai = new City(); // create object of another class
		
		// to call non static method of another class
		//objectName.methodName();
		
		mumbai.swargate();  // called non static method from another class.
		
		
	}
    public void method1()
{
	System.out.println("This is Non Static method1");
}

}
