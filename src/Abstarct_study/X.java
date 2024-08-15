package Abstarct_study;

public abstract class X {
 // This is Abstract class X
	public void timePass1() {
		System.out.println("Hii, Do you know Abstract method");
	}
	public abstract void timePass2();
	
	public abstract void timePass3();
	public abstract void timePass4();
	public abstract void timePass5();
	public void timePass6(int a) {
		System.out.println("The value of a is "+a);
	}
	public void timePass7(String name, String name1) {
		System.out.println(name+" and "+name1+" are brothers ");
	}
	public void timePass8() {
		int a=8;
		int b=5;
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}
}
