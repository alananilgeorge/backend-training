package training3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StringPatternUsingRecursion {
	static List<Character> res = new ArrayList<Character>();

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string pattern");
		try {
			String str = new String(s.next());

			pattern(str, 1);
			res.forEach((i) -> System.out.print(i));
		} catch (InputMismatchException e) {
			System.out.println("Input a string");
		}
	}

	public static void pattern(String s, int num) {

		int i = 0;
		int n;
		while (i < num) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '[') {
					System.out.println(s.charAt(j - 1));
					num = Character.getNumericValue(s.charAt(j - 1));
					pattern(s.substring(j + 1, s.length()), num);
				} else if (Character.isDigit(s.charAt(j))) {
					continue;
				} else if (s.charAt(j) == ']') {
					continue;
				} else {
					res.add(s.charAt(j));
				}
				i++;

			}
		}
	}

}
