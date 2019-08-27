package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customers = scan.nextInt();
		for (int trials = 0; trials <= customers; trials++) {
			String names = scan.next();
			String F = names.charAt(0);
		
			String Last = scan.next();
		
			int count = scan.nextInt();
				for (int i = 0; i <= count; i++ ) {
					int quantity = scan.nextInt();
					int price = scan.nextInt();
					int itemTotal = price * quantity;
					int Total = itemTotal;
		}
		
	
		
		System.out.println(F.  "+ " Last.  "+ " Total );
		}
	}
}
