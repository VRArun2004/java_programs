package Array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Driver_student {
public static void main(String[] args) {
	ArrayList<Student> students=new ArrayList<>();
	students.add(new Student("arun",21,2311));
	students.add(new Student("chandru",31,2311));
	students.add(new Student("arjith",41,2311));
	students.add(new Student("hitesh",24,2311));
	students.add(new Student("sheela",11,2311));
 
	students.sort(null);
	
	for(int i=0;i<students.size();i++) {
		System.out.println(students.get(i));
	}
	Collections.sort(students,new CompareBasedOnAge());
	
	for(int i=0;i<students.size();i++) {
		System.out.println(students.get(i));
	}
}
}
