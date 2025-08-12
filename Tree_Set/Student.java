package Tree_Set;

public class Student implements Comparable<Student>{
String name;
int rollno;
int age;
public Student(String name, int rollno, int age) {
	super();
	this.name = name;
	this.rollno = rollno;
	this.age = age;
}
@Override
public int compareTo(Student o) {
	return this.name.compareToIgnoreCase(o.name);
}
@Override
public String toString() {
	return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
}

}
