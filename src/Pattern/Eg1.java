package Pattern;

public class Eg1 {

	public static void main(String[] args) {

		//*
		//**
		//***
		//****
		//*****
		int row=5;
		int column=5;
	    int star=1;
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
	}

}
