package Patterns;

public class Square_hollow_pattern {

	public static void main(String[] args) {
		
		 int size = 5;

	     // Outer loop for rows
	     for (int i = 1; i <= size; i++) {

	         // Inner loop for columns
	         for (int j = 1; j <= size; j++) {
	             // Print asterisks for the first and last rows
	             // or for the first and last columns
	             if (i == 1 || i == size || j == 1 || j == size) {
	                 System.out.print("* ");
	             } else {
	                 System.out.print("  "); // Print spaces for the hollow part
	             }
	         }
	         // Move to the next line after each row is printed
	         System.out.println();
	     }
	}

}
