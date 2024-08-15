package variableTypes;

public class Sample {
	// This is types of variable
	// there is two types 1. local variable 2. global variable
	
	int a=18;   // This is Non-Static global variable
	static int b =15;  // This is Static global variable
	
	public static void main(String[] args) {
		
		// calling non static regular method in main class
		Sample sample=new Sample();
		sample.test1();
		
		// calling static regular method in main class
		Sample.test2();
	}
	
    public void test1()    // This is non static regular method
    {                      // In non static regular method we can use static global variable and non static global variable both.
    
    	int x=12;    //this is local variable
    	int y = 22;    //this is local variable
    	int sum = x+a;
    	System.out.println("addition is "+sum);
    	
    }
    
    public static void test2()   // this is static regular method 
    {
    	// In static regular method we can use static global variable only.
    	int p=88;   ////this is local variable
    	
    	int mul =p-b;
    	System.out.println("Multiplication is "+mul);
    }
}

