package iterator_prog;
import java.util.*;
public class List_iterator {
public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<>();
	a1.add(10);
	a1.add(20);
	a1.add(39);
	a1.add(40);
	ListIterator<Integer> i=a1.listIterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	while(i.hasPrevious()) {
		System.out.println(i.previous());
	}
}
}
