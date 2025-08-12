package Array_list;

import java.util.ArrayList;

public class sample {
public static void main(String[] args) {
	//first array list
	ArrayList<Integer> a1=new ArrayList<>();
	a1.add(1);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	a1.add(2,15);
	System.out.println(a1);
	a1.remove(1);
	System.out.println(a1);
	a1.remove((Object)40);     //Integer i=40;    a1.remove(i);
	System.out.println(a1);
	//sum of elements in collection
	int sum=0;
	for(int i=0;i<a1.size();i++) {
		sum+=(int)a1.get(i);
	}
	System.out.println("sum of array list element a1 :  "+sum);
	//second array list
	ArrayList<Integer> a2=new ArrayList<>();
	a2.add(100);
	a2.add(200);
	a2.add(300);
	System.out.println(a2);
	a2.addAll(a1);
	System.out.println(a2);
	a2.removeAll(a1);             // if we remove this line then only we 
	System.out.println(a2);       // can able to see the O/P of retainAll()
	a2.retainAll(a1);             // else it will  like this []
	System.out.println(a2);
	a2.clear();                   // clear the all the object in the list
	System.out.println(a2);
	System.out.println(a1.contains(30));
	System.out.println(a1.contains(40));
	
}
}
