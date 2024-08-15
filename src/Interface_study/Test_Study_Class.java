package Interface_study;

public class Test_Study_Class implements Test_Study,Test_Study2{

	public static void main(String[] args) {
		Test_Study_Class tsc=new Test_Study_Class();
		tsc.sample();
		tsc.sample2();
		tsc.sample3();
		tsc.sample4();

	}

	@Override
	public void sample3() {
		System.out.println("I am ritesh");
		
	}

	@Override
	public void sample4(){
		System.out.println("Roopali is a good girl");
	}

	@Override
	public void sample() {
	System.out.println("Sujay is a good boy");
	}

	@Override
	public void sample2() {
		System.out.println("Komal is a good girl");
		
	}

}
