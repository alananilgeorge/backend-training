package training3;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplyUsingArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		int r,c;
		System.out.println("Enter rows and columns");
		Scanner s = new Scanner(System.in);
		r = s.nextInt();
		c = s.nextInt();
		System.out.println("Enter matrix 1 :");
		for (int i = 0; i < r; i++) {
			matrix.add(new ArrayList<Integer>());
			for (int j = 0; j < c; j++) {
				matrix.get(i).add(s.nextInt());
				
			}
			
		}
		System.out.println("Enter constant");
		int num = s.nextInt();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				matrix.get(i).set(j, matrix.get(i).get(j)*num);
				
			}
			
		}
		System.out.println("Result : "+matrix);
	}

}
