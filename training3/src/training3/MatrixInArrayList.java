package training3;

import java.util.ArrayList;
import java.util.Scanner;


public class MatrixInArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		System.out.println("Enter rows and columns");
		int r,c;
		Scanner s = new Scanner(System.in);
		r = s.nextInt();
		c = s.nextInt();
		System.out.println("Enter matrix 1 :");
		for (int i = 0; i < r; i++) {
			matrix1.add(new ArrayList<Integer>());
			for (int j = 0; j < c; j++) {
				matrix1.get(i).add(s.nextInt());
				
			}
			
		}
		System.out.println("Enter matrix 2 :");
		for (int i = 0; i < r; i++) {
			matrix2.add(new ArrayList<Integer>());
			for (int j = 0; j < c; j++) {
				matrix2.get(i).add(s.nextInt());
				
			}
			
		}
		
		for (int i = 0; i < r; i++) {
			result.add(new ArrayList<Integer>());
			for (int j = 0; j < c; j++) {
				result.get(i).add( matrix2.get(i).get(j) + matrix1.get(i).get(j) );
				
			}
			
		}
		System.out.println("Sum is :" + result);
		
	}
}
