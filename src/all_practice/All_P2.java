package all_practice;

public class All_P2 {
	
	String city = "NAGPUR";
    String city2 = "BHANDARA";
    char c = 'B';
    static int a = 500;
    

	public void method5() {
		
		//a = 900; // Changing the value of static variable 'a'
		
        System.out.println("Method5: Static variable 'a' in class 2 is " + a);
        
        All_P obj = new All_P();
        System.out.println("Value of city in class 1 is " + obj.city2);
	}
}
