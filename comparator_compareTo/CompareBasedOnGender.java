package comparator_compareTo;

import java.util.Comparator;

public class CompareBasedOnGender implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.gender, o2.gender);
	}

}
