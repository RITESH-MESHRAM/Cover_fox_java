package accessSpecifiers;

public class PublicSpecifier {
	public int B= 88;   // The Scope of public access specifire is throughout the project.
           int C=60;  // This is default global variable
	
	
	public static void main(String[] args) {
		
		PublicSpecifier pb=new PublicSpecifier();
System.out.println("This is public access specifire B value is "+pb.B);

System.out.println("This is default global variable C value is "+pb.C);

	}

}
