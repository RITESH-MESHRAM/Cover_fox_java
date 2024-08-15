package Interview;

public class Primeno_between1to100 {

	public static void main(String[] args) {
		
		for(int no=1; no<100; no++) {
			int y=0;
			for(int x=2; x<no; x++) {
			if(no%x==0) {
			y++;
			}
			}
			if(y==0) {
			System.out.print(no+"  ");
			}
		}
	}

}
