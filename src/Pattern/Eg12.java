package Pattern;

public class Eg12 {

	public static void main(String[] args) {
        //*****
		//  *
		//  *
		//*****
		int row=4;
		int column=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				if(i==1 || j==3 ||i==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			} System.out.println();
		}
		
	}

}
