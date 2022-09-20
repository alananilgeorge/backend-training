package training1;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		

		String str = s.nextLine();

		String str2 = "";
		int length=0;
		for(char i: str.toCharArray()) {
			length++;
		}
		System.out.println(length);
		for(int i = length-1;i>=0;i--) {
			
			str2+=str.charAt(i);
		}
		System.out.println(str2);
		s.close();
	}
}
		