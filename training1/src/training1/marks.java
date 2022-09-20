package training1;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your mark: ");
		
		int mark = s.nextInt();
		if(mark>=90) {System.out.println("Amazing");
			
		}
		else if(mark>=80) {System.out.println("Good");
		
		}
		else if(mark>=70) {System.out.println("All right");
		
		}
		else {System.out.println("Okay");
		
		}
		s.close();

	}

}
