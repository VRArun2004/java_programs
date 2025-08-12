package HashSet_prog;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
 String eName;
 int eId;
 double eSalary;
public Employee(String eName, int eId, double eSalary) {
	super();
	this.eName = eName;
	this.eId = eId;
	this.eSalary = eSalary;
}
@Override
public String toString() {
	return "Employee [eName=" + eName + ", eId=" + eId + ", eSalary=" + eSalary + "]";
}
@Override
public int compareTo(Employee o) {
	return this.eName.compareTo(o.eName);
}
public boolean equals(Object o) {
	Employee e=(Employee)o;
	if (this.eName != e.eName)
		return false;
	if (this.eId != e.eId)
		return false;
	if(this.eSalary!=e.eSalary)
		return false;
	return true;
}

public int hashCode() {
	return Objects.hash(eName,eId,eSalary);
}
 
}
