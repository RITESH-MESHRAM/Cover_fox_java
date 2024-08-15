package practice;

public class Static_Block {
	
	    static int b;
	    public static void show()	    
	    {
	        System.out.println("Static method");
	    }
	    static
	    {
	        b = 5;
	        System.out.println("Value of b : " + b);
	        show();
	    }
	    static 
	    {
	        b = 10;
	        System.out.println("Value of b : " + b);
	    }
	    
	    public static void main(String arg[])
	    {
	        System.out.println("Main method");
	    }
	}

