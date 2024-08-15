package practice;

public class FabiSeri {

	public static void main(String[] args) {
		// Fabonacci series using for loop
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=6;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c+"");
		}
		System.out.println("===================");
		// Fabonacci series using while loop
	     int x=0;
	     int y=1;
	     int z;
		int i=1;
		while(i<=8) {
			z=x+y;
			x=y;
			y=z;
			System.out.println(z+" ");
			i++;
		}
		System.out.println("===========================");
		// Fabonacci series using do while loop
		int p=0;
		int q=1;
		int r;
		do {
			r=p+q;
			p=q;
			q=r;
			System.out.println(r+" ");
			i++;
		} while (i<=9);
		System.out.println("=================================");
		
		int x1=0;
		int y1=1;
		int z1;
		for (int k=1;k<=8;k++) {
			 z1=x1+y1;
			 x1=y1;
			 y1=z1;
			 System.out.println(z1);
			
		}
		

	}

}
