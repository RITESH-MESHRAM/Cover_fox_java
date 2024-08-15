package Polymorphism_study;

public class RunTimePolymorphism1 extends  RunTimePolymorphism {

	public static void main(String[] args) {
		RunTimePolymorphism1 rp=new RunTimePolymorphism1();
		rp.boss();
		//rp.boss(5);
		//rp.boss(34, 89);
		RunTimePolymorphism rmp=new RunTimePolymorphism();
	    rmp.boss();

	}
	// method overriding
public void boss() {
	System.out.println("Bhai-Bhai");
}
}
