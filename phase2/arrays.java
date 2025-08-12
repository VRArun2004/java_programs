package phase2;
import java.util.*;
public class arrays {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		sum(a);
		product(a);
		min(a);
		max(a);
		reverse(a);
	}

	public static void sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				sum += a[i];
			}
		}
		System.out.println("sum of even index elements");
		System.out.println(sum);
	}
	public static void product(int[] a) {
		int prod = 1;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				prod *= a[i];
			}
		}
		System.out.println("prod of odd index elements");
		System.out.println(prod);
	}
	public static void min(int[] a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("minimum element");
		System.out.println(min);
	}
	public static void max(int[] a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("maximum element");
		System.out.println(max);
	}
	public static void reverse(int[] a) {
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		System.out.println("reversed array");
		System.out.println(Arrays.toString(a));
		
	}
}
