package Interface_study;

public class Study3 implements study,study2 {

	public static void main(String[] args) {
	Study3 s=new Study3();
	s.day();
	System.out.println("___________________________________");
	s.day1();
	System.out.println("____________________________________");
	s.day2();
	System.out.println("____________________________________");
	s.day4();
	System.out.println("____________________________________");
	s.day5();
	System.out.println("____________________________________");
	s.day6();
	System.out.println("____________________________________");
	
System.out.println("The value of a is : "+a);
System.out.println("The value of b is : "+b);
int sum=a+b;
System.out.println("The sum of a+b = "+sum);
	}

	@Override
	public void day4() {
		System.out.println("This is day4 method from interface study2");
		
	}

	@Override
	public void day5() {
		System.out.println("This is day5 method from interface study2");
		
	}
    @Override
	public void day() {
		study.super.day();
		study2.super.day();
		
	}

	@Override
	public void day1() {
		System.out.println("This is day1 method from interface study");
		
	}

	@Override
	public void day2() {
		System.out.println("This is day2 method from interface study");
		
	}
	static void day6() {
		study.day6();
		study2.day6();
	}

	
}
