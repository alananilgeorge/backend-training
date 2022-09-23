package training3;

import java.util.HashMap;
import java.util.Scanner;

public class StudentHash {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int mark, num;
		Scanner s = new Scanner(System.in);
		String name = new String();
		System.out.println("Enter number of students");
		num = s.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.printf("Enter student %d name and mark", num);
			name = s.next();
			mark = s.nextInt();
			map.put(name, mark);
		}

		System.out.println("Enter Student name to check mark");
		name = s.next();
		if (map.containsKey(name)) {
			System.out.println(map.get(name));
		}
		else {
			System.out.println("No such student exists in record!");
		}

	}

}
