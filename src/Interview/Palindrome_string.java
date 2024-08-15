package Interview;

public class Palindrome_string {

	public static void main(String[] args) {
		
		String name = "madam";
		int length = name.length();
		String rev ="";
		for(int i=length-1; i>=0; i-- ) {
		rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(name.equals(rev)) {
		System.out.println("Name is palindrome");
		}
		else {
		System.out.println("Name is not palindrome");
		}
	}

}
