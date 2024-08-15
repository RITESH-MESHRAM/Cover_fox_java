package Pattern;

public class Eg7 {

	public static void main(String[] args) {

		// * * * *
		//  * * *
		//   * *
		//    *
		
		int row=4;
		int star=4;
		int space=3;
		
		// outer for loop
		for(int i=1;i<=row;i++) {
			//inner for loop
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
				}
			for(int k=1;k<=star;k++) {
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
			
		}
		
		
		
	}

}
