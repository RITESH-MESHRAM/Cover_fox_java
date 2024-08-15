package Pattern;

public class Eg10 {

	public static void main(String[] args) {

		//*****
		//*
		//***
		//*
		//*
		int row=5;
	        
	        for (int i = 1; i <= row; i++) {
	            if (i == 1) {
	                // Print 5 stars for the first line
	                for (int j = 0; j < 5; j++) {
	                    System.out.print("*");
	                }
	            } else if (i == 2 || i == 4 || i == 5) {
	                // Print 1 star for the second, fourth, and fifth lines
	                System.out.print("*");
	            } else if (i == 3) {
	                // Print 3 stars for the third line
	                for (int j = 0; j < 5; j++) {
	                    System.out.print("*");
	                }
	            }
	            // Move to the next line after printing stars for the current line
	            System.out.println();
	        }
	    }
	}


