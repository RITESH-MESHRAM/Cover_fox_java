package practice;

public class SwitchStatment {

	public static void main(String[] args) {
		
		char Alphabets='D';
		
		switch(Alphabets) {
		case 'a','e','i','o','u','A','E','I','O','U':System.out.println("This is Vowel : "+Alphabets);
		break;
		
		case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z','B', 'C','D','F', 'G','H', 'J','K','L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V','W', 'X','Y','Z': System.out.println("This is consonant : "+Alphabets);
		break;
		
		default: System.out.println("Please enter only alphabets from A to Z");
		break;
		
		}
	}

}
