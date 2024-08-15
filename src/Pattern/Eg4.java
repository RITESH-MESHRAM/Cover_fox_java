package Pattern;

public class Eg4 {

	public static void main(String[] args) {

		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		
		//rows-->7 star-->1
		//outer for loop--> row
		int row=9;
		int star=1;
		for(int i=1;i<=row;i++)
		{
		//inner for loop-->star
		for(int j=1;j<=star;j++)
		{
		System.out.print("*");

		}
		System.out.println();
		if(i<5)
		{
		star++;
		}
		else
		{
		star--;
		}
		}
	}
}
