package constructor;

public class B extends A {
	public B() {
		super("Akshay","Bunty");
		System.out.println("This is constructor in class B");
	}
	
	public static void main(String[] args) {
		B b = new B();
	}

}
