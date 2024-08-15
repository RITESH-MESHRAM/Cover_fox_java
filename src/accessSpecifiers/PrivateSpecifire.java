package accessSpecifiers;

public class PrivateSpecifire {
	
	private int a = 20; // Private Access Specifire , 
	
	//The Scope of Private Access Specifire is Within a Class.
	

	public static void main(String[] args) {
		
		 PrivateSpecifire ps= new  PrivateSpecifire();
		 System.out.println("This is private access specifier and the value of a is "+ps.a); 
		 
		 // calling public access specifire in in another class
		 PublicSpecifier pb=new PublicSpecifier();
		 System.out.println("This is public access specifire and the value of B is "+pb.B);

		 //calling private non static regular method 
		 ps.test();

	}
	private void test() {
		System.out.println("This is private non static regular method and value of a is "+a);
	}
}
