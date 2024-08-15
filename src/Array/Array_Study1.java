package Array;

public class Array_Study1 {

	public static void main(String[] args) {
		
		int rollNo[][]= new int[2][2];
		
		rollNo[0][0]=3;
		rollNo[0][1]=8;
		rollNo[1][0]=9;
		rollNo[1][1]=4;
		
		for (int i = 0; i < rollNo.length; i++) {
            for (int j = 0; j < rollNo[i].length; j++) {
                System.out.print(rollNo[i][j] + " ");
            }
            System.out.println();
		
		}
	}

}
