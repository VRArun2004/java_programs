package linked_list;

public class DriverForSingly {
	public static void main(String[] args) {
		SinglyLinkedList s1 = new SinglyLinkedList();
		System.out.println(s1.isEmpty());
		System.out.println(s1.size());
		System.out.println(s1.append(10));
		System.out.println(s1.size());
		System.out.println(s1.isEmpty());
		System.out.println(s1.prepend(30));
		System.out.println(s1.size());
		System.out.println(s1.append(90));
		System.out.println(s1.prepend(110));

		s1.print();
		s1.insert(0,49);
		s1.print();
		s1.deleteFirst();
		s1.print();
		s1.deleteIndex(3);
		s1.print();
		s1.deleteLast();
		s1.print();
		System.out.println(s1.size);
		
		SinglyLinkedList s2= new SinglyLinkedList();
		System.out.println(s2.isEmpty());
		System.out.println(s2.size());
		System.out.println(s2.append(77));
		System.out.println(s2.size());
		System.out.println(s2.isEmpty());
		System.out.println(s2.prepend(33));
		System.out.println(s2.size());
		System.out.println(s2.append(95));
		System.out.println(s2.prepend(88));
		SinglyLinkedList.link(s1,s2);
		s1.print();
	}
}

