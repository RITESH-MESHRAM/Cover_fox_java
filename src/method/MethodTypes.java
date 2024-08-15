package method;

import test.FirstClass;

public class MethodTypes {

	public static void main(String[] args) { //this is main method 
		// TODO Auto-generated method stub
		System.out.println("this is main method");
        testMe();
        testMe1();
        MethodTypes.testMe();
        
        //calling static method from another class
        //Syntax-->> ClassName.methodName();
        
        FirstClass.sample();
	}

	public static void testMe()   //This is regular method
	{
		System.out.println("This is static regular method");
	}
	
	public static void testMe1()
	{
		System.out.println("This is regular method");
		
	}
	
}
