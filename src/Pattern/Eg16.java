package Pattern;

public class Eg16 {

	public static void main(String[] args) {

		//****
		//***
		//**
		//*
		
		int row=4;
		int star=4;
		
		for(int i=1;i<=row;i++) {
			for(int j =1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		    star--;
		}
   }
}
