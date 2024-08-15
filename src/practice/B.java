package practice;

public class B {
	
public B() {
	//this(22);
	System.out.println("This is public constructor");
}
public B(int a) {
	//this();
	super();
	System.out.println("My name is Ritesh");
	System.out.println("The value of a is "+a);
	//super();
}
	public static void main(String[] args) {
		
    B b= new B(10);
    //B b1= new B();
    
	}

}
