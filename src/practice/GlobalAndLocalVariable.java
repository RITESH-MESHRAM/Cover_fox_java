package practice;

public class GlobalAndLocalVariable {
	static int a=66;
	int b=28;
	public static void main(String[] args) {
		GlobalAndLocalVariable g=new GlobalAndLocalVariable ();
		g.variable();
		g.variable2();
		System.out.println("The value of global variable is "+a);
	}
protected void variable() {
	int a=88;
	int f=98;
	int sum = this.a+b;
	System.out.println("The addition of variable, global variable a+ Global variable b = "+sum);
	
	System.out.println("Multiplicatin of Global variable b * Local variable b = "+b*this.b);
}
public void variable2() {
	int s=47;
	String name="Salman";
	String sarName="khan";
	System.out.println(name+" "+sarName);

	System.out.println("Division is a/s = "+a/s);
	
	System.out.println("Substraction of variable b-s= "+( b-s));
}

}
