package is_a_relationship;

public class Student extends Person {
double fees;
public void exam() {
	System.out.println("writing exam");
}
public static void main(String[] args) {
	Student stud=new Student();
	System.out.println("student class");
	stud.name="Gopal";
	stud.age=18;
	stud.gender='M';
	place="villupuram";
	stud.fees=90000.25;
	stud.exam();
	stud.eat();
	stud.sleep();
	stud.learn();
}
}
