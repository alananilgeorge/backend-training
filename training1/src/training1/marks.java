package training1;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidMarkException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidMarkException(String s) {
		System.out.println(s);
	}
}

public class marks {

	public static void main(String[] args) throws InvalidMarkException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your mark: ");
		try {
			int mark = s.nextInt();
			if (mark >100) {
				throw new InvalidMarkException("Enter mark between 100 and 0");
			} else if (mark >= 90) {
				System.out.println("Amazing");
			} else if (mark >= 80) {
				System.out.println("Good");

			} else if (mark >= 70) {
				System.out.println("All right");
			} else {
				System.out.println("Okay");
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter integer");
		}
		s.close();

	}

}
