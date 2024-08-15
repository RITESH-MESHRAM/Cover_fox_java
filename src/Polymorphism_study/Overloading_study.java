package Polymorphism_study;

public class Overloading_study {

	public  void add (int a, int b) {     // in method overloading method name same but parameter different  
		int sum = a+b;
		System.out.println("The sum of a and b is "+sum);
}
	
    public void add (int a, int b , int c) {
    	int sum= a+b+c;
    	System.out.println("The sum of a , b, and c is "+sum);
    }
    
}
