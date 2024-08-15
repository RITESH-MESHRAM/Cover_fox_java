package controlStatment;

public class Switch_Case_Statement {

	public static void main(String[] args) {
		
		// if i want to call day's name for that i will use int data type 1,2,3,...7
		// Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday 
		
		int day=4;
		switch (day) {
		case 1: System.out.println("Today is Sunday");
		break;
		
		case 2: System.out.println("Today is Monday");
		break;
		
		case 3: System.out.println("Today is Tuesday");
		break;
		
		case 4: System.out.println("Today is Wednesday");
		break;
		
		case 5: System.out.println("Today is Thursday");
		break;
		
		case 6: System.out.println("Today is Friday");
		break;
		
		case 7: System.out.println("Today is Staturday");
		
	
	default:
	System.out.println("Please enter value between 1 to 7");
	break;
	}
}
}
	
