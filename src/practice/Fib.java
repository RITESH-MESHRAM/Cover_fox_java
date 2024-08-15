package practice;

public class Fib {

	public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21
		int x=0;
		int y=1;
		int z=y;
		for(int i=1;i<=10;i++) {
			z=x+y;
			x=y;
			y=z;
			System.out.println(z);
		}
	}
}
