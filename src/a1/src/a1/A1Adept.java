package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
				// read all items, assign variable and price
				String food = scan.next();
				int price = scan.nextInt();
				if ( food.equals(scan.next())) {
					int cus = price * scan.nextInt(); }
					else { food = scan.next();
				}
				}
				// scan for next string, assign to variable, scan for variable
				// multiply by that variable price per customer
		// System.out.println("Biggest: " + big);
		// System.out.printIn("Smallest: " + small);
	   //System.out.printIn("Average: " + avg);
		
	}
}
