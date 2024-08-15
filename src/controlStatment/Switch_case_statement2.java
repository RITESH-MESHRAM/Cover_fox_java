package controlStatment;

public class Switch_case_statement2 {

	public static void main(String[] args) {
		//M-->
		//F-->
		char gender='M';
		switch (gender)
		{
		case 'M' :System.out.println("You are male");
		break;
		case 'F':System.out.println("You are female");
		break;
		default: System.out.println("Please enter gender values between M/F");
		break;
	}
	}
}
