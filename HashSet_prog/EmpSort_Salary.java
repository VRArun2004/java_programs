package HashSet_prog;

import java.util.Comparator;

public class EmpSort_Salary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		//return o1.eSalary-o2.eSalary;    (or)
		return Double.compare(o1.eSalary, o2.eSalary);
	}

}
