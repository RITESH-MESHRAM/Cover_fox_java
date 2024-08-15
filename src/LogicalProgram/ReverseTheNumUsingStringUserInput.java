package LogicalProgram;

import java.util.Scanner;

public class ReverseTheNumUsingStringUserInput {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        System.out.println("Original number: " + number);

	        String numberInString = Integer.toString(number);
	        String reverse = "";
	        for (int i = numberInString.length() - 1; i >= 0; i--) {
	            reverse = reverse + numberInString.charAt(i);
	        }

	        int reverseNumber = Integer.parseInt(reverse);
	        System.out.println("Reverse number: " + reverseNumber);

	        scanner.close();
		
		
	}

}
