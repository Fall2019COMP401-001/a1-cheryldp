package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Create array of items
		// Create double array of prices
		int rows = scan.nextInt();
		String [] groceries = new String[rows];
		double [] prices = new double[rows ];
			for (int idx = 0; idx < rows; idx++) {
				groceries[idx] = scan.next();	
				prices[idx] = scan.nextDouble();
			}
			
		// Scan for item and quantity
		// for loop to index array for price
		// multiple price and quantity
			int customers = scan.nextInt();
			double [] totals = new double [customers ];
			String[] firstNames = new String[customers];
			String[] lastNames = new String[customers];
			for (int i = 0; i < customers; i++) {
				String name = scan.next();
				firstNames[i] = name;
				String lastName = scan.next();
				lastNames[i] = lastName;
				int cart = scan.nextInt();
				for (int search = 0; search < cart; search++) {
					int quantity = scan.nextInt();
					String item = scan.next();
					
					for (int count = 0; count < rows; count++) {
					if (item.equals(groceries[count])) {
						double cost = prices[count];
						double itemTotal = cost * quantity;
						totals[i] += itemTotal;
					}
					else { totals[i] = totals[i];
					}
					}
						

				}
			}
		
		//store customer totals in array corresponding with first and last concatd. array
			int idxMost = 0;
			double most = totals[0];
			for (int i = 0; i < customers; i ++) {
				if (most >= totals[i]) {
					 most = most;
					 idxMost = 0;
				} else {
					most = totals[i];
					idxMost  = i;
				}
			}
			int idxLeast = 0;
			double least = totals[0];
			for (int i = 0; i < customers; i++) {
				if (least <= totals[i]) {
					least = least;
	
				} else { 
					least = totals[i];
					idxLeast = i;
				}
			}
			String formatMost = String.format("%.2f", most);
			String.format("%.2f", least);
			
			double average = 0;
			double sum = 0;
			for (int i = 0; i < totals.length; i++) {
				double value = totals[i];
				 sum += value;
				average = sum / totals.length ;
			}
				String avg = String.format("%.2f",  average);
			
			
			System.out.println("Biggest: " + firstNames[idxMost] + " " + lastNames[idxMost] + " (" + formatMost + ")" );
			System.out.println("Smallest: " + firstNames[idxLeast] + " " + lastNames[idxLeast] + " (" + least + ")" );
			System.out.println("Average: " + avg);
}
}