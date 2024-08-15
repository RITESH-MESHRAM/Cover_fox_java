package LogicalProgram;


public class ReverseTheNumberUsingStringMethod {

	public static void main(String[] args) {
 
		int number=12345; // output-->> 54321
		int reverseNumber;
		System.out.println("Original number "+number);
		String numberInString = Integer.toString(number);
		String reverse="";
		for(int i=numberInString.length()-1;i>=0;i--) {
			reverse=reverse+numberInString.charAt(i);
		}
		 reverseNumber = Integer.parseInt(reverse);
		System.out.println("Reverse number "+reverseNumber);
	}

}

