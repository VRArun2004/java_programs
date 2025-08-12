package HashSet_prog;

import java.util.HashSet;

public class sample {
public static void main(String[] args) {
	HashSet<Integer> h1=new HashSet<>();
	h1.add(10);
	h1.add(20);
	h1.add(30);
	h1.add(40);
	h1.add(50);
	h1.add(60);
	for(Integer i: h1) {
		System.out.println(i);
	}
}
}
