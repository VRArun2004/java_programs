package comparable_compareTo;

public class Student implements Comparable<Student> {
int age;
String name;
public Student(int age, String name) {
	this.age = age;
	this.name = name;
}
@Override
public int compareTo(Student s) {
	//return this.age-s.age;  // it is used to sort based on number in ascending
	return s.age-this.age;    // it is used to sort based on number in decending  
	//return this.name.compareTo(s.name);  // it is used to sort based on string
}
@Override
public String toString() {
	return "[" + age + ", " + name + "]";
}


}
