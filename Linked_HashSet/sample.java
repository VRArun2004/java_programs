package Linked_HashSet;

import java.util.LinkedHashSet;

public class sample {
public static void main(String[] args) {
	LinkedHashSet<Integer> l1=new LinkedHashSet<>();
	l1.add(340);
	l1.add(60);
	l1.add(30);
	l1.add(320);
	l1.add(20);
	
	for(Object o:l1) {
		System.out.println(o);
	}
}
}
