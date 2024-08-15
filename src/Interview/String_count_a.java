package Interview;

public class String_count_a {

	public static void main(String[] args) {
		
		String name = "Ritesh";
		int count =0;
		for(int i=0; i<name.length(); i++) {
		if(name.charAt(i)=='i') {
		count++;
		}
		}
		System.out.println("total count of i is :- "+ count);
		}

}
