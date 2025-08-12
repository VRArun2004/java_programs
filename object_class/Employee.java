package object_class;

public class Employee {
	int empid;
	String empname;
	double empsal;

	public Employee(int empid, String empname, double empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.empid == emp.empid;
	}
}
