package Interface_study;

public class Demo2 implements Demo1 {

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.test1();
		d.test2();
		d.test3();
		System.out.println(a);
		System.out.println(b);
		d.test4(67);
	}

	@Override
	public void test1() {
		System.out.println("This is test1 method from Demo1 interface");
		System.out.println(a);
	}

	@Override
	public void test2() {
		System.out.println("This is test12 method from Demo1 interface");
	}

	@Override
	public void test3() {
		
		System.out.println("This is test3 method from Demo1 interface");
	}
	public void test4(int a) {
		System.out.println("This is test4 method from Demo1 interface");
		System.out.println("The value of a is : "+a);
		System.out.println(" The value of Local a : "+a + " and global a is : "+this.a);
	}

}
