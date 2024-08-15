package LogicalProgram;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your number");
          int num = sc.nextInt();
		//int num=10;
		if (num%2==0) {
			System.out.println("Given number is even number");
		}
		else {			
			System.out.println("Given number is Odd number");
           }
	}
}
