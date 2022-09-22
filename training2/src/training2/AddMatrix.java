package training2;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[][] matrix1 = new int[5][5];
		int[][] matrix2 = new int[5][5];
		int r, c;
		System.out.println("Enter matrix rows and columns");
		r = s.nextInt();
		c = s.nextInt();
		System.out.println("Enter first matrix elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix1[i][j] = s.nextInt();

			}
		}
		System.out.println("Enter second matrix elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix2[i][j] = s.nextInt();

			}
		}

		System.out.println("Sum is :");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("  " + (matrix1[i][j] + matrix2[i][j]));

			}
			System.out.println();
		}
	}
}
