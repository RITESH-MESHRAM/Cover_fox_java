package controlStatment;

public class ControlStatment {

	public static void main(String[] args) {
		 // 1. If marks is greater than 40 ,then student is pass.
		// if statement 
		int marks =48;
		if(marks>40)
		{
			System.out.println("pass");
		}
		
		//2. If marks is greater than 40 then student is pass otherwise fail.
		// if else statement
		
		int marks1=35;
		if(marks1>40) 
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	//3. else if statement
		//Syntax:
		//if (condition1) {
			  // block of code to be executed if condition1 is true
			//} else if (condition2) {
			  // block of code to be executed if the condition1 is false and condition2 is true
			//} else {
			  // block of code to be executed if the condition1 is false and condition2 is false
		
		//Question -
		//>=60-->1st class
		//>=50-->2nd class
		//>=40-->just pass
		//<40 -->fail
		//if marks greater than or equal 60 then you are in 1st class
		//else if marks greater than or equal to 50 then you are in 2nd class
		//else if marks greater than or equal to 40 then you just in pass class
		//else you are fail
		
	if (marks>=66) {
		
	System.out.println("You are in dist");
		
	}
	else if (marks>=50) {
		System.out.println("You got 1st class");
	}
	else if (marks>=35) {
		System.out.println("You are just pass");
	}
		
	else {
		System.out.println("You are fail");
	}
	
	//if you are male(M/F) then turn right
	//
	
	char male ='g';
	char female='F';
	if (male=='M')
	{
		System.out.println("turn right");
	}
	else if (female=='F')
	{
		System.out.println("turn left");
	}
	else 
	{
		System.out.println("stop");
	}
	
	
	
	//Assignment-->>>
	
	String signal="red";
	
	if(signal=="green") {
		System.out.println("vehicles can go");
	}
	else if(signal=="yellow") {
		System.out.println("vehicles should wait");
	}
	else if(signal=="red") {
		System.out.println("vehicles should stop");
	}
	
	//Assignment 2--->>
	
	int mark=65;
	
	if(mark>=80) {
		System.out.println("you are passed with first class");
		
	}
	else if(mark>=60) {
		System.out.println("you are in 2nd class");}
	
	else if(mark>=40) {
		System.out.println("you are in distinction");
	}
	else {
		System.out.println("you are failed,try again");
	}
	
	}

}
