package project;

import java.util.Comparator;

public class CompareBasedOnSize implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Shoe s1 = (Shoe) o1;
		Shoe s2=(Shoe)o2;
		return Integer.compare(s1.getSize(), s2.getSize());
	}


}
