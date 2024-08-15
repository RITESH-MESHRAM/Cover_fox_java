package LogicalProgram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int Sum=a+b;
		//System.out.println(Sum);
		
		//Scanner Class
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.next();
		
		System.out.println("My Name is "+name);
		sc.close();
		
	}
}
