package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		// Create an array of items
		// Look for items customers number of times
		// Create array of index item corresponding w number of times bought
		// 3 arrays of 6, 
			//items in store, number of times purchased, number of customers who purchased
		int rows = scan.nextInt();
		String [] groceries = new String[rows];
		
			for (int idx = 0; idx < rows; idx++) {
				groceries[idx] = scan.next();	
				 double skipPrice = scan.nextDouble();
			}
			
			int customers = scan.nextInt();
			int [] purchased = new int[rows];
			int [] cusBought = new int [rows];
			
			for(int c = 0; c < customers; c++) {
			String name = scan.next() + scan.next();
			int itemsPerCus = scan.nextInt();
			int [] storage = new int [rows];
			
				for (int i = 0; i < itemsPerCus; i++) { //go through this loop 3 times
				int quantity = scan.nextInt();
				String food = scan.next();
				for (int count = 0; count < rows; count++) { //6 times per items bought
				if (food.equals(groceries[count])) {
					purchased[count] += quantity;
					storage[count] ++;
				} else {
					purchased[count] = purchased[count];
						}
	
					}
				}
			for (int n = 0; n < rows; n++) {
				if (storage[n] > 0) {
					cusBought[n]++;
				}
			}
		
				}
			
		
				for (int value = 0; value < rows; value++) {
					if (purchased[value] > 0) {
			System.out.println(cusBought[value]+ " " + "customers bought" + " " + purchased[value] + " " + groceries[value]);
					} else {
						System.out.println("No customers bought" + " " + groceries[value]);	
					}
					}
			}
	}

