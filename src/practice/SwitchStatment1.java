package practice;

 public class SwitchStatment1 {

	public static void main(String[] args) {
		//SWITCH STATMENTS
		
		String name="Sujay";
		switch(name) {
		
		case "Ritesh","Sujay":
			System.out.println("==========================================");
			System.out.println(name+" is a Handsome Boy.");
			System.out.println("==========================================");
		break;
		
		case "Roopali" , "Komal","Pallavi","Priyanka": 
			System.out.println("==========================================");
			System.out.println(name+" is a Beautiful Girl.");
			System.out.println("==========================================");
		break;
		
		default: System.out.println("Please enter valid name");
		break;
		
		}
		
	}

}
