package Pattern;

public class Eg15 {

	public static void main(String[] args) {

		//*
		//*
		//*
		//*
		//*****
		
		int row=5;
		int column=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=column;j++) {
				if(j==1 || i==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
