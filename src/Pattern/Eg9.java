package Pattern;

public class Eg9 {

	public static void main(String[] args) {

		//*****
		//*
		//*****
		//*
		//*****
		 int Rows = 5;
	        
	        for (int i = 0; i <Rows; i++) {
	            if (i % 2 == 0) {
	                // Print a line of 5 stars
	                for (int j = 0; j < 5; j++) {
	                    System.out.print("*");
	                }
	            } else {
	                // Print a single star
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}
