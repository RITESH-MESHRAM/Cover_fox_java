package controlStatment;

public class Nested_If_Else_Statement {

	public static void main(String[] args) {
		
		// For example:-
		
		// Enter your email id
		// if email id is correct, then enter the password
		// if password is correct then login success
		// else password is incorrect
		// else email id is incorrect
		
		String emailId="riteshpm1998@gmail.com";     //variable declaration + initialization
		String password="ritesh#123";
		
		if(emailId=="riteshpm1998@gmail.com") {
			System.out.println("Email id is correct, please enter password");
			
			if(password=="ritesh#123")
			{
				System.out.println("Passworrd is correct, login successfully");
			}
			else {
				System.out.println("please enter correct password");
			}
		}
		else {
			System.out.println("email is incorrect");
		}
	}

}
