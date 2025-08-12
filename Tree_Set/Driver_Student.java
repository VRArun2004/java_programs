package Tree_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Driver_Student {
	public static void main(String[] args) {
	TreeSet<Student> l1=new TreeSet<>();
		l1.add(new Student("arun", 123, 22));
		l1.add(new Student("santosh", 636, 35));
		l1.add(new Student("chandru", 737, 21));
		l1.add(new Student("hitesh", 673, 32));
		l1.add(new Student("dhanish", 373, 75));
		Comparator<Student> sort_rollno=(Student s1,Student s2)-> Integer.compare(s2.rollno, s1.rollno);
				for(Object o:l1) {
			System.out.println(o);
		}
				ArrayList<Student> a1=new ArrayList<>(l1);
				Collections.sort(a1,sort_rollno);
				System.out.println();
				for(Object o:a1) {
					System.out.println(o);
				}
				
	}
}
