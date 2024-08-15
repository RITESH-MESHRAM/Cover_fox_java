package Abstarct_study;

public class B extends A {
	public static void main(String[] args) {
		B b = new B();
		b.sample();
		b.sample1();
		b.sample2();
		b.sample3();
		b.sample4();
		
	}

		@Override
	public void sample3() {
		System.out.println("Class A's method3 completein class B");
		
	}

		@Override
		public void sample4() {
			System.out.println("Class A's method4 complete in class B");
			}
		}
