package is_a_relationship;

public class Teacher extends Person {
double salary;
public void teaching() {
	System.out.println("teaching students");
}
public static void main(String[] args) {
	Teacher teacher=new Teacher();
	System.out.println("teacher class");
	teacher.name="Ramya";
	teacher.age=27;
	teacher.gender='F';
	teacher.salary=100000.50;
	teacher.teaching();
	teacher.eat();
	teacher.sleep();
	teacher.learn();
}
}
