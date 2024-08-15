package Interview;

public class Armstrong {

	public static void main(String[] args) {
		//nos- 153,370,371,407,1634.........
		int no=153;
		int i=0;
		int j;
		while(no>0) {
		j=no%10;
		i=j*j*j+i;
		no=no/10;
		}
		System.out.println(i);

	}

}
