package project;

import java.util.Comparator;

public class CompareBasedOnPrice implements Comparator<Shoe> {
	
	@Override
	public int compare(Shoe s1, Shoe s2) {
		
		return Double.compare(s1.getPrice(), s2.getPrice());

	}
	
}
