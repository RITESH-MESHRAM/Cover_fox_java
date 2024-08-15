package Pattern;

public class Star_pattern {

	public static void main(String[] args) {
		// ****
		// ****
		// ****
		int row = 3;
		int column = 4;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
