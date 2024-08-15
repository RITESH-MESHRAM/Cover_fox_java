package Pattern;

public class Eg6 {

	public static void main(String[] args) {

		//    *
		//   * *
		//  * * * 
		// * * * *
		//* * * * *
		int row=5;
		int star=1;
		int space=4;
		
		//Outer for loop
		for(int i=1;i<=row;i++) {
			//inner for loop
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
			
		}
		
		
		
	}

}
