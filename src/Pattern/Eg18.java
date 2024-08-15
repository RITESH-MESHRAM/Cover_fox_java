package Pattern;

public class Eg18 {

	public static void main(String[] args) {

		//**   **    **
		//**   **    **
		//*************
		//**   **    **
		//**   **    **
		
		int row=5;
		int column=13;
		for(int i=1; i<=row;i++) {
			for(int j=1;j<=column;j++) {
				if(i==3||j==1||j==2||j==6||j==7||j==12||j==13) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		
	}

}
