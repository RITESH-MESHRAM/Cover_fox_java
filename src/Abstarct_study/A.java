package Abstarct_study;

public abstract class A {
	
public static void main(String[] args) {
	//A a = new A();   We can not create objet in abstract class 
}
	public void sample() {
		System.out.println("This is sample method");
	}
	public void sample1() {
		System.out.println("This is sample1 method");
	}
	public void sample2() {
		System.out.println("This is sample2 method");
	}
	public abstract void sample3();  //incomplete method
	public abstract void sample4();  //incomplete method
	
}
