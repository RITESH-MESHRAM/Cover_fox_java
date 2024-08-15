package controlStatment;

public class Switch_Statement_Assignment {

	public static void main(String[] args) {
		//Assignment→JAN FEB MAR APR MAY .....DEC
		// January, February, March, April, May, June, July, August, September, October, November, and Decembe
		String month="mar";
		
		switch(month) {
		case "jan": System.out.println("This is January month" );
		break;
			
		case "feb": System.out.println("This is  February month");
		break;
		
		case"mar": System.out.println("This is March month");
		break;
		
		case"apr": System.out.println("This is April month");
		break;
		
		case"may": System.out.println("This is May month");
		break;
		
		case"jun": System.out.println("This is June month");
		break;
		
		case"jul": System.out.println("This is July month");
		break;
		
		case"aug": System.out.println("This is August month");
		break;
		
		case"sep": System.out.println("This is September month");
		break;
		
		case"oct": System.out.println("This is Octomber month");
		break;
		
		case"nov": System.out.println("This is November month");
		break;
		
		case"dec": System.out.println("This is December month");
		break;
		
		default:
			System.out.println("Please enter month name in between Jan-Dec");
			break;
		
		}
		}
	

}
