package Array_list;

import java.util.Arrays;

public class Array_stream_api {
public static void main(String[] args) {
	int[] arr= {1,2,3,4};
	Integer a1=Arrays.stream(arr).map(a->{
		System.out.println("map applied");
		return a+10;
		}).reduce((a,b)->a+b).getAsInt();
	System.out.println(a1);
}
}
