package lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class bottle_driver {
	public static void main(String[] args) {
		ArrayList<bottle> a=new ArrayList<>();
		a.add(new bottle("signoware", 400));
		a.add(new bottle("milton",800));
		a.add(new bottle("tuppersware", 200));
		a.add(new bottle("b-cool", 1000));
		a.add(new bottle("H2O", 500));
		
		System.out.println("-----sort by compare to using normal way for brand-----");
		Collections.sort(a);
		print(a);
		System.out.println("----- sort by compare using lambda expression for capacity-----");
		Comparator<bottle> p=(o1,o2)->o1.brand.compareToIgnoreCase(o2.brand);
		Comparator<bottle> c=(o1,o2)->Integer.compare(o1.capacity,o2.capacity);
		Collections.sort(a,c);
		print(a);
		System.out.println("----- sort by compare using lambda expression for price-----");
		Collections.sort(a,p);
		print(a);
	
	}
	public static void print(ArrayList<bottle> a) {
		System.out.println();
		for(Object o:a) {
			System.out.println(o);
			}
		System.out.println();
	}
}
