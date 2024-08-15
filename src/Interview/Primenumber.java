package Interview;

public class Primenumber {

	public static void main(String[] args) {
	
		int no=5;
		int a=0;
		for(int i=2; i<no-1; i++) {
		if(no%2==0) {
		a=a+1;
		}
		}
		if(a==0) {
		System.out.println("prime no:- "+no);
		}
		else {
		System.out.println("not prime:- "+no);
		}

	}

}
