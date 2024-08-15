package practice;

public class Eg1 {

	public static void main(String[] args) {

		//**  **  **
	    //**  **  **
		//********** 
		//**********  
		//**  **  **
		//**  **  **
		int row =6;
		int column=10;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				if(j==1 || i==3 || j==6 ||j==2 || j==5 || j==9||j==10 ||i==4) {
					System.out.print("*");
				}
			 else {
				System.out.print(" ");
			}
		} System.out.println();
    }
 }
}
