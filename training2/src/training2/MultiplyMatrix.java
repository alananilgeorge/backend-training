package training2;

import java.util.Scanner;

public class MultiplyMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[][] matrix1 = new int[5][5];
		int[][] matrix2 = new int[5][5];
		int[][] matrix3 = new int[5][5];
		int r1, c1, r2, c2;
		System.out.println("Enter matrix 1 rows and columns");
		r1 = s.nextInt();
		c1 = s.nextInt();
		System.out.println("Enter matrix 2 rows and columns");
		r2 = s.nextInt();
		c2 = s.nextInt();
		if (r1 == c2) {
			System.out.println("Enter first matrix elements");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					matrix1[i][j] = s.nextInt();

				}
			}
			System.out.println("Enter second matrix elements");
			for (int i = 0; i < r2; i++) {
				for (int j = 0; j < c2; j++) {
					matrix2[i][j] = s.nextInt();

				}
			}

			System.out.println("Product is :");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {

					for (int k = 0; k < c1; k++) {
						matrix3[i][j] += matrix1[i][k] * matrix2[k][j];

					}
				}

			}
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					System.out.print(matrix3[i][j] + "   ");

				}
				System.out.println();
			}

		} else {
			System.out.println("Cannot perform multiplication");
		}
	}
}