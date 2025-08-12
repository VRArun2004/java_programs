package HashSet_prog;

import java.util.Comparator;

public class EmpSort_ID implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		//return o1.eId-o2.eId;   (or)
		return Integer.compare(o1.eId,o2.eId);
	}

}
