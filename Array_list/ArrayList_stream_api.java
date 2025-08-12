package Array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayList_stream_api {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 4, 2, 6, 3, 6, 3, 6, 3, 5, 4));
		System.out.println("---unique elem----");
		System.out.println(a1.stream().distinct().toList()); // efficient way use to remove duplicate

		List<Integer> l1 = a1.stream().distinct().toList();
		System.out.println(l1);
		System.out.println("-----unique even elem-----"); // normal way
		for (int i = 0; i < l1.size(); i++) {
			if (l1.get(i) % 2 == 0)
				System.out.println(l1.get(i));
		}
		System.out.println("-----unique even elements-----"); // efficient way
		List<Integer> l2 = a1.stream().distinct().filter((a) -> a % 2 == 0).toList();
		System.out.println(l2);
		System.out.println("-----Square of elements-----");   //normal way
		for (int i = 0; i < a1.size(); i++) {
			System.out.print(a1.get(i) * a1.get(i)+ ",");
		}
        System.out.println("\n----square of elem using methods----");
        List<Integer> l3 = a1.stream().map(a->a*a).toList();
		System.out.println(l3);
		System.out.println("----unique_square of elem using methods----");
		List<Integer> l4 = a1.stream().map(a->a*a).distinct().toList();
		System.out.println(l4);
		System.out.println("----max & min elememt in array list");
		Integer l5 = a1.stream().max((a,b)->a-b).get();        //max elem
		System.out.println(l5);
		System.out.println(a1.stream().min((a,b)->a-b).get()); //min elem
		System.out.println("---toArray----");
		Object[] arr = a1.stream().map(a->a*a).toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println("---- sorted ----");
		List<Integer> l6 = a1.stream().sorted().toList();  //default order
		System.out.println(l6);
		//or
		List<Integer> l7 = a1.stream().sorted((a,b)->b-a).toList();//Descending order
		System.out.println(l7);
		System.out.println("---- limit ----");
		List<Integer> l8 = a1.stream().limit(4).toList();
		System.out.println(l8);
		System.out.println("---reduce will add all the elements in collections---");
		Integer l9 = a1.stream().reduce((a,b)->a+b).get();
		System.out.println(l9);
		
		System.out.println("---second max and min---");
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1, 4, 2, 6, 3, 6, 3, 6, 3, 5, 4));
		Integer i=a2.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst().get();
		System.out.println("second max :"+i);
		Integer i1=a2.stream().distinct().sorted((a,b)->a-b).skip(1).findFirst().get();
		System.out.println("second min :"+i1);
		
		System.out.println("----lower & upper case-----");
		ArrayList<String> s = new ArrayList<>(Arrays.asList("arun","Chandru","hitesH"));
	    List<String> up=s.stream().map(String::toUpperCase).toList();
	    List<String> low=s.stream().map(String::toLowerCase).toList();
	    System.out.println("Upper case: "+up);
	    System.out.println("Lower case: "+low);
	    s.stream().map(String::toLowerCase).forEach(System.out::println); //print using forEach
	}
}
