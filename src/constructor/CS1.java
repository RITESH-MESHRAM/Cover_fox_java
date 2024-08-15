package constructor;

public class CS1 {
	// Constructor always written in above main method and below class.
	
    public CS1()  // User define--->> Constructor without parameter/zero parameter
    { 
	System.out.println("constructor without parameter");
	}
    public CS1(int a) //Constructor with parameter
    {
    	System.out.println("Constructor with parameter "+a);
    }
    public CS1(float a) //Constructor with parameter
    {
    	System.out.println("Constructor with parameter "+a);
    }
    public CS1(String a)
    {
    	System.out.println("String data type parameter "+a);
    }
    
    public static void main(String[] args) 
    {
		CS1 cs1 = new CS1();  
		CS1 cs2 = new CS1(11);
		CS1 cs3 = new CS1(11.1f);
		CS1 cs4 = new CS1("Ritesh");
	}
}
