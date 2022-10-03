package training1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pyramidFor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("Enter n: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		}
		catch(InputMismatchException e) {
			System.out.println("Enter number");
		}
		s.close();
	}
}