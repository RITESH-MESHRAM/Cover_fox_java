package practice;

public class Static_method {
	public static void main(String[] args) {
		//new Static_method();
		Static_method sm=new Static_method();
		sm.Rits();
	}

	static {
		System.out.println("this is static method 1");
	}
	static {
		System.out.println("this is static method 2");
	}
	{
		System.out.println("this is non-static method");
	
	}
	
	public void Rits() {
		System.out.println("This is Rits method");
	}
}

