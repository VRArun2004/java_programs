package project;

import java.util.Comparator;

public class CompareBasedOnPriceDescending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Shoe s1 = (Shoe) o1;
		Shoe s2 = (Shoe) o2;
		return Double.compare(s2.getPrice(), s1.getPrice());
	}

}
