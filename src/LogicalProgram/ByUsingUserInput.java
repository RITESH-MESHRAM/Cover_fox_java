package LogicalProgram;

import java.util.Scanner;

public class ByUsingUserInput {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age ");
		 int age = sc.nextInt();
		if(age>=18) {
			System.out.println("you are valid user to drive car!");
		}
		else if(age<=18) {
			int s1 = 18-age;
			System.out.println("you are not valid youser to drive car you have to wait "+s1+" years.");
		}
		
	}

}
