package practice;

public class Cs {

	public Cs(){
		super();
		//this("Sujay");
		System.out.println("Hello");

	}
	public Cs(String name) {
		//this();
		System.out.println("Name is "+name);
	}
	
	public static void main(String[] args) {
		Cs cs= new Cs();
		cs.test();
		Cs css= new Cs("Ritesh");
	}
 public void test() {
	 System.out.println("This is non static regular method ");
 }
}
