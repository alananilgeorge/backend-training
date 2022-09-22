package training1;

import java.util.Scanner;

public class pyramidWhile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n: ");

		int n = s.nextInt();
		int i = n;
		int j = 0;
		while (i > 0) {
			while (j < i - 1) {
				System.out.print(" ");
				j++;
			}
			j = 0;
			while (j < n - i + 1) {
				System.out.print("* ");
				j++;
			} 
			i--;
			j = 0;
			System.out.println("\n");

		}
		s.close();
	}
}
