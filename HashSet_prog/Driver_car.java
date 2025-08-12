package HashSet_prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Driver_car {
public static void main(String[] args) {
	HashSet<Car> h1=new HashSet<Car>();
	h1.add(new Car("rollce royce", 234567654));
	h1.add(new Car("lambhorgani", 12345675));
	h1.add(new Car("mersidies", 2345673));
	h1.add(new Car("tata", 2333));
	h1.remove(new Car("mersidies", 2345673));
	ArrayList<Car> a1=new ArrayList<>();
	a1.addAll(h1);
	Collections.sort(a1);
	
	for(Object o:a1) {
		System.out.println(o);
	}
}
}
