package LogicalProgram;

public class SwapNumbers {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		System.out.println("Before swap a is " + a + " b is " + b);
		int c=a; //10
		    a=b; //20
		    b=c; //10
		    System.out.println("After swap a is " + a + " b is " + b);
		    
		    System.out.println("===============================================================");
		
		//Swape without third value
		    int x = 100;
		    int y = 90;
		    System.out.println("Before swap x is " + x + " y is " + y);
		    x = x + y;// 100+90-->190

		    y = x - y;// 190-90-->100
		    x = x - y;// 190-100-->90
		    System.out.println("After swap x is " + x + " y is " + y);
		
	}

}
