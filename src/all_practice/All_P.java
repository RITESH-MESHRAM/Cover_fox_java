package all_practice;

public class All_P {
	
	String city="pune";
	String city2="mumbai";
	char c='A';
	static int a=284632;
	 
 public static void main(String[] args) {
	  All_P p=new All_P();
	  p.method1(25);
	  p.method2("pune", "mumbai");
	  p.method3();
	  p.method4();
	  
	 All_P2 obj = new All_P2();
      obj.method5();
		
	}
 
public void method1(int value) {
	System.out.println("Methos1: Static variable value is "+value);
	
}

public void method2(String city1, String city2) {
	System.out.println("Method2: Cities are " + city1 + " and " + city2);
	
}
public void method3() {
	if(city=="pune") {
		System.out.println("Method3: city is pune");
	}	
	else {
		System.out.println("Method3: city is not pune");
	}
}
public void method4() {
	for (int i=10; i<=140;i=i+20) {
		System.out.println(i);
		System.out.println("Method4:" +city+" to "+city2+" rod distance is "+i);
	}
}
}


