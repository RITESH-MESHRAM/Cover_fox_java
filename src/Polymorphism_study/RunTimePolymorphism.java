package Polymorphism_study;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		//RunTimePolymorphism rmp=new RunTimePolymorphism();
	    //rmp.boss();
	}
    public void boss() {
    	boss(7);
    	System.out.println("This is boss method");
    }
    public void boss(int a ) {
    	boss(3,7);
    	System.out.println(a);
    }
    public void boss(int b,int d) {
    	int sum=b+d;
    	System.out.println("Sum is "+sum);
    }
}
