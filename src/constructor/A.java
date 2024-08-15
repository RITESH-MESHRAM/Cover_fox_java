package constructor;

public class A {
	
	public A() {
		this(12);
		System.out.println("This is user define zero parametor constructor");
	}
	public A(int a) {
		this("ritesh","sujay");
		System.out.println("This is user define single parametor constructor");
		System.out.println("The value of a is "+a);
	}
	public A(String name, String name1) {
		System.out.println(name+" and "+name1+" are friend");
	}

	public static void main(String[] args) {
		A a=new A();
       // A a1=new A(12);
	}

}
