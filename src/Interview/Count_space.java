package Interview;

public class Count_space {

	public static void main(String[] args) {
		String name="Ri t e sh";
		int countspace=0;
		for(int i=1; i<name.length()-1; i++) {
		if(name.charAt(i)==' ') {
		countspace++;
		}
		}
		System.out.println("Total space= "+countspace);
		}
}
