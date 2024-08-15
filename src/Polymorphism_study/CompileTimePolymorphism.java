package Polymorphism_study;

import Polymorphism_study.CompileTimePolymorphism;

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		CompileTimePolymorphism cp=new CompileTimePolymorphism();
		cp.rm();
		cp.rm(34);
		cp.rm(54, 89);
		cp.rm("Raja");
		
	}
	// method overloading
    public void rm() {
	System.out.println("Hello");
}
	public void rm(int a) {   // method overloading
		System.out.println("int a is "+a);
	}
	public void rm(int b,int d) {  // method overloading
		int sum=b+d;
		System.out.println("int b and int d sum is "+sum);
	}
	public void rm(String name) {    // method overloading
		System.out.println("Name is "+name);
	}
}
