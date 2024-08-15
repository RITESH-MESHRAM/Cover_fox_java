package practice;

public class Nested_Loop2 {

	public static void main(String[] args) {
		String Atm_Card_No ="MH2453";    
		String password="12345";
		
		if(Atm_Card_No=="MH2453") {
			System.out.println("Atm card number is correct Please enter password");
			
			if(password=="12345") {
				System.out.println("Password is correct, check current balance");
				}
			
				else {
					System.out.println("Please enter valid password");
				}
			}
		else {
				System.out.println("Please enter valid Atm number");
				}

	}

}
