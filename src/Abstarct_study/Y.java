package Abstarct_study;

public class Y extends X {
// this is concreate class Y
	public static void main(String[] args) {
		Y y= new Y();
		y.timePass1();
		y.timePass2();
		y.timePass3();
		y.timePass4();
		y.timePass5();
		y.timePass6(22);
		y.timePass7("Ritesh", "Bunty");
		y.timePass8();
	}

	@Override
	public void timePass2() {
		System.out.println("Hello");
		
	}

	@Override
	public void timePass3() {
		System.out.println("How are you");
		
	}

	@Override
	public void timePass4() {
		System.out.println("Bye guys");
		
	}

	@Override
	public void timePass5() {
		System.out.println("================");
		
	}

}
