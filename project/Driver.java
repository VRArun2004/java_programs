package project;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Shoe[] s = { new Shoe("nike", 2000.5, "sports", 7), new Shoe("nike", 1555.4, "sneakers", 9),
				new Shoe("adidas", 3000.43, "sneakers", 6), new Shoe("adidas", 900.45, "sports", 11),
				new Shoe("bata", 2045.78, "formal", 8), new Shoe("bata", 800.34, "sneakers", 7),
				new Shoe("adidas", 4089.43, "sports", 10), new Shoe("puma", 1999.43, "sports", 8),
				new Shoe("adidas", 2060.5, "sports", 6) ,new Shoe("puma", 8000.5, "sports", 7),
				new Shoe("bata", 5750.5, "formal", 7),new Shoe("adidas", 800.5, "sneakars", 9),
				new Shoe("nike", 2050.5, "sports", 7),new Shoe("puma", 6000.5, "sports", 7),
				new Shoe("bata", 2000.5, "formal", 7),new Shoe("adidas", 9000.5, "sports", 7)};

		Scanner sc = new Scanner(System.in);
		System.out.println("=== SHOE FILTER & SORT SYSTEM ===");

		// Filters
		System.out.print("Enter brand to filter (leave blank to skip): ");
		String brandFilter = sc.nextLine().trim().toLowerCase();

		System.out.print("Enter type to filter (leave blank to skip): ");
		String typeFilter = sc.nextLine().trim().toLowerCase();

		System.out.print("Enter size to filter (0 to skip): ");
		int sizeFilter = sc.nextInt();
		sc.nextLine();

		// Sort Option
		System.out.println("\nSort by:");
		System.out.println("1. Brand");
		System.out.println("2. Price");
		System.out.println("3. Type");
		System.out.println("4. Size");
		System.out.print("Enter your choice (1–4): ");
		int sortChoice = sc.nextInt();
		sc.nextLine();

		int orderChoice = 1;
		if (sortChoice == 2) {
			System.out.print("Sort Price:\n1. Ascending\n2. Descending\nEnter choice: ");
			orderChoice = sc.nextInt();
			sc.nextLine();
		}

		// Filter shoes
		Shoe[] filtered = new Shoe[s.length];
		int index = 0;
		for (Shoe s1 : s) {
			if (!brandFilter.isEmpty() && !s1.getBrand().toLowerCase().equals(brandFilter))
				continue;
			if (!typeFilter.isEmpty() && !s1.getType().toLowerCase().equals(typeFilter))
				continue;
			if (sizeFilter != 0 && s1.getSize() != sizeFilter)
				continue;
			filtered[index++] = s1;
		}

		if (index == 0) {
			System.out.println("\nNo shoes matched your filters.");
			sc.close();
			return;
		}

		Shoe[] finalArray = new Shoe[index];
		System.arraycopy(filtered, 0, finalArray, 0, index);

		// Choose comparator
		Comparator comparator = null;
		switch (sortChoice) {
		case 1:
			comparator = new CompareBasedOnBrand();
			break;
		case 2:
			comparator = (orderChoice == 2) ? new CompareBasedOnPriceDescending() : new CompareBasedOnPrice();
			break;
		case 3:
			comparator = new CompareBasedOnType();
			break;
		case 4:
			comparator = new CompareBasedOnSize();
			break;
		default:
			System.out.println("Invalid sort option.");
			sc.close();
			return;
		}

		// Sort and display
		Arrays.sort(finalArray, comparator);
		System.out.println("\n=== SORTED SHOES ===");
		for (Shoe s1 : finalArray) {
			System.out.printf("%-8s | ₹%-10.2f | %-10s | Size: %d%n", s1.getBrand(), s1.getPrice(), s1.getType(),
					s1.getSize());
		}

		sc.close();
	}

}
