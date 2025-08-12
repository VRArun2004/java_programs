package HashSet_prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Driver_Employee {
public static void main(String[] args) {
	HashSet<Employee> h1=new HashSet<>();
	h1.add(new Employee("Arun", 123, 80000.5));
	h1.add(new Employee("Gopal", 546, 60000.3));
	h1.add(new Employee("Chandru", 747, 80000.9));
	h1.add(new Employee("Hitesh", 535, 250000.7));
	h1.add(new Employee("Santosh", 363, 200000.1));
	
	ArrayList<Employee> a1=new ArrayList<>();
	a1.addAll(h1);
	System.out.println("-----original set-----");
	print(a1);
	System.out.println("-----Sorted by name-----");
	Collections.sort(a1);
	print(a1);
	System.out.println("-----Sorted by ID-----");
	Collections.sort(a1,new EmpSort_ID());
	print(a1);
	System.out.println("-----Sorted by Salary-----");
	Collections.sort(a1,new EmpSort_Salary());
	print(a1);
	System.out.println("-----obj removed set-----");
	a1.remove(new Employee("Hitesh", 535, 250000.7));
	print(a1);
	System.out.println("-----obj removed set by one parameter-----");
	a1.removeIf(emp -> emp.eName.equals("Santosh"));
	print(a1);
}


public static void print(ArrayList<Employee> a1) {
	System.out.println();
	for(Object o:a1) {
		System.out.println(o);
	}
	System.out.println();
}
}
