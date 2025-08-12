package Stream_prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Driver_Employee {
public static void main(String[] args) {
	ArrayList<Employee> e1=new ArrayList<>(Arrays.asList(
			new Employee("arun", 12, 21, 100000, null),
			new Employee("chandru", 18, 20, 80000, null),
			new Employee("hitesh", 64, 21, 50000, null),
			new Employee("kalagappan", 34, 22, 60000, null),
			new Employee("balaji", 27, 24,40000, null),
			new Employee("arjith", 26, 30, 40000, null) ));
	Predicate<Employee> p=(a)->{
		if(a.salary>5000) return true;
		return false;
	};
	List<Employee> l2=e1.stream().filter(p).toList();
	System.out.println(l2);
	Function<Employee,Employee> f=(a)->{
		a.salary+=500;
		return a;
				};
	List<Employee> l3=e1.stream().map(f).toList();
	System.out.println(l3);
	
    e1.stream().distinct().forEach(System.out::println);
    System.out.println();
 }
}
