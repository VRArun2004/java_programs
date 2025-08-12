package Stream_prog;

import java.util.Objects;

public class Employee {
String name;
int id;
int age;
double salary;
String role;
public Employee(String name, int id, int age, double salary, String role) {
	super();
	this.name = name;
	this.id = id;
	this.age = age;
	this.salary = salary;
	this.role = role;
}
@Override
public String toString() {
	return "Emp[" + name + "," + id + "," + age + "," + salary + "," + role + "]";
}
@Override
public int hashCode() {
	return Objects.hash( salary);
}
@Override
public boolean equals(Object obj) {

	Employee o = (Employee) obj;
	if(this.salary==o.salary)return true;
	return false;
}


}
