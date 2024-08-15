package methodStudy;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Main method running");
		
		//  I want to call static regular method from same class.
		//syntax----->> methodName();
		m1();  
		
		// I want to call non static regular method from same class.
		// syntax--->>  ClassName objectName = new ClassName();
		Test1 test1 = new Test1();
		
		//how to call non static regular method 
		// objectName.methodName();
		test1.m2();    // calling non static method from same class.
		System.out.println("=======================================================================");
		
		// calling static method from another class
		// syntax----->> ClassName.methodName();
		Test2.m3();
		
		// calling non static method from another class
		// we want object from the class whose method we want to call
		// ClassName objectName = new ClassName();
		Test2 test2 = new Test2();  // create object of another class
		
		// how to call non static regular method
		// objectName.methodName();
		
		test2.m4();  // calling non static method from another class
		System.out.println("Main method stopped");
		
}
	
	//static regular method
    public static void m1()
    {
    	System.out.println("This is static regular m1 method from Test1 class");
	}
    
    //non static regular method
    public void m2()  
    {
    	System.out.println("This is static regular m2 method from Test1 class");
    }
}
