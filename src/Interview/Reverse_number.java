package Interview;

public class Reverse_number {

	public static void main(String[] args) {
		
		int no=123456;
		int a=0;
		int b;
		while(no>0) {
		b=no%10; //b=123/10=12.3
		a=a*10+b; 
		no=no/10;
		}
		System.out.println(a);
		}
}
