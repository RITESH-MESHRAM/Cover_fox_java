package Pattern;

public class Eg5 {

	public static void main(String[] args) {

		int rows=13;
		int star=1;
		//outer for loop
		for(int i = 1; i<=rows;i++) {
			//inner for loop
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<7) {
				star++;
			}
			else {
				star--;
			}
		}
	}

}
