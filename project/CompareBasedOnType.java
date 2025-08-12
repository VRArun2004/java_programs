package project;

import java.util.Arrays;
import java.util.Comparator;

public class CompareBasedOnType implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Shoe s1 = (Shoe) o1;
		Shoe s2=(Shoe)o2;
		return s1.getType().compareToIgnoreCase(s2.getType());
	}

	
}
