package training3;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixMulArrayList {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> matrix3 = new ArrayList<ArrayList<Integer>>();
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
				matrix1.add(new ArrayList<Integer>());
				for (int j = 0; j < c1; j++) {
					matrix1.get(i).add(s.nextInt());

				}
			}
			System.out.println("Enter second matrix elements");
			for (int i = 0; i < r2; i++) {
				matrix2.add(new ArrayList<Integer>());
				for (int j = 0; j < c2; j++) {
					matrix2.get(i).add(s.nextInt());

				}
			}

			System.out.println("Product is :");
			for (int i = 0; i < r1; i++) {
				matrix3.add(new ArrayList<Integer>());
				for (int j = 0; j < c2; j++) {
					matrix3.get(i).add(0);
					for (int k = 0; k < c1; k++) {
						matrix3.get(i).set(j, matrix3.get(i).get(j) + matrix1.get(i).get(k) * matrix2.get(k).get(j));

					}
				}

			}
			System.out.println(matrix1);
			System.out.println(matrix2);
			System.out.println("");
			System.out.println(matrix3);

		} else {
			System.out.println("Cannot perform multiplication");
		}
	}
}