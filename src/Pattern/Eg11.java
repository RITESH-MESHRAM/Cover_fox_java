package Pattern;

public class Eg11 {

	public static void main(String[] args) {

		int row= 4;
		int column=5;
		//Outer for loop for row
		for(int i=1; i<=4;i++) {
			//inner for loop for column
			for(int j=1;j<=5;j++) {
				//cell (i for row ,j for column)
				if(i==1 || j==1 || i==row || j==column) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
