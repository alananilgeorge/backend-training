package training3;

import java.util.Scanner;
import java.util.Stack;

public class stringPattern {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner S = new Scanner(System.in);
		String s = new String();
		s = S.next();

		Stack<Integer> nums = new Stack<>();
		Stack<String> res = new Stack<>();

		res.push("");
		for (int i = 0; i < s.length(); i++) {
			char chr = s.charAt(i);
			if (Character.isDigit(chr)) {
				int start = i;
				while (Character.isDigit(s.charAt(i + 1)))
					i++;
				nums.push(Integer.parseInt(s.substring(start, i + 1)));
			} else if (chr == '[') {
				res.push("");
			} else if (chr == ']') {
				String str = res.pop();
				StringBuilder sb = new StringBuilder();
				int n = nums.pop();

				for (int j = 0; j < n; j++) {
					sb.append(str);
				}
				res.push(res.pop() + sb.toString());
			} else {
				res.push(res.pop() + chr);
			}
		}
		System.out.println("String is:" + res.pop());

	}

}
