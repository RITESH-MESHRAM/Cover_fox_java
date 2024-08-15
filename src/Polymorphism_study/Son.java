package Polymorphism_study;

public class Son extends Father {
	
	public static void main(String[] args) {
		
		Father f= new Father();
		f.money();
		
		Son s=new Son();
		s.money();
 }
	// method overrides 
public void money() {
	System.out.println("son has money 870000");
}
}
