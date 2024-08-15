package Pattern;

public class Eg17 {

	public static void main(String[] args) {

		//0
		//10
		//010
		//1010
		
		int row=4;
		int num=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i-j);
			}
			System.out.println();
				num++;
			}
		}
	}
