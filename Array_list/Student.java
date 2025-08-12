package Array_list;

public class Student implements Comparable<Student> {
String name;
int age;
int rollno;
public Student(String name, int age, int rollno) {
	this.name = name;
	this.age = age;
	this.rollno = rollno;
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", rollno=" + rollno + "]";
}
public boolean equals(Object o) {
	Student s1=(Student)o;
	if(this.name!=s1.name) return false;
	if(this.age!=s1.age) return false;
	if(this.rollno!=s1.rollno) return false;
	return true;
}
@Override
public int compareTo(Student s) {
	return this.name.compareToIgnoreCase(s.name);
}
}
