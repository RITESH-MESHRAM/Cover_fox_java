package LogicalProgram;

public class RemoveVowels {

	public static void main(String[] args) {

		String s = "Apple";
		String z = "";
		// Vowels-->a e i o u
		// int count=0;
		String s1 = s.toLowerCase();
		for (int i = 0; i <= s1.length() - 1; i++) {
		char t = s1.charAt(i);
		if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') {
		// count++;
		continue;
		}
		z = z + t;
		}
		System.out.println(z);
		//System.out.println("Number of vowels are "+count);
		}
	}
