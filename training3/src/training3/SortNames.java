package training3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ten names: ");

		for (int i = 0; i <10; i++) {
			names.add(s.next().toLowerCase());
			
		}
		Collections.sort(names);
		System.out.println("Sorted list is : " + names);
		

	}

}
