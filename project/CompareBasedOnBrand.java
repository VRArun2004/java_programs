package project;

import java.util.Comparator;

public class CompareBasedOnBrand implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Shoe s1 = (Shoe) o1;
		Shoe s2 = (Shoe) o2;
		return s1.getBrand().compareToIgnoreCase(s2.getBrand());
	}


}
