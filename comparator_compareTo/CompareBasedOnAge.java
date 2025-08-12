package comparator_compareTo;

import java.util.Comparator;

public class CompareBasedOnAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.age, o2.age);
	}

}
