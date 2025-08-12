package Array_list;

import java.util.Comparator;

public class CompareBasedOnAge implements Comparator<Student> {


	@Override
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.age,s2.age);
	}

}
