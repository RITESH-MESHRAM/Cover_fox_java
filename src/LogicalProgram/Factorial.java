package LogicalProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
    //5!=5*4*3*2*1=120  ----->>like this
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		
		int Factorial=1;
		for(int i=num;i>=1;i--) {
			Factorial=i*Factorial;
		}
		//System.out.println(Factorial);
		System.out.println("Factorial of "+num+" is "+Factorial);
	}

}
