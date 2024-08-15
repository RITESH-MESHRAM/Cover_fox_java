package methodStudy;

public class Calculator {
	
	int a = 10;  // variable declaration + initialization 
	int b = 90;  // variable declaration + initialization 

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.addition();
		
		calculator.subtraction();
	
		multiplication();
		
		calculator.division();
		
		calculator.modulus();
		
	}
    public void addition() //non static method
    {
    	int sum = a+b;
    	System.out.println("Addition is "+sum);
    }
    public void subtraction()
    {  
    	int sub = a-b;
    	System.out.println("Subtraction is "+sub);
    } 
    public static void multiplication()  // This is static method
    {  
    	int a = 10;
    	int b = 90;
    	int mul = a*b;
    	System.out.println("Multiplication is "+mul);
    }
    public void division()
    {
    	int div = a/b;
    	System.out.println("Division is "+div);
    }
     public void modulus()
     {
    	 int mod=a%b;
    	 System.out.println("Modulus is "+mod);
     }
}
