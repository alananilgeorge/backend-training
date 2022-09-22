package training1;

import java.util.Scanner;

public class colour {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter fruit:");
		String fruit = s.nextLine();
		switch (fruit) {
		case "banana":
			System.out.println("Yellow");
			break;
		case "apple":
			System.out.println("Red");
			break;
		default:
			System.out.println("Green");

		}

		s.close();
	}
}
