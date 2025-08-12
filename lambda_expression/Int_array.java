package lambda_expression;

import java.util.Arrays;

public class Int_array {
	public static void main(String[] args) {
		Integer[] a = { 10, 46, 2, 6, 3, 5, 8, 7, 86 };
		Arrays.sort(a, (o1, o2) -> Integer.compare(o2, o1));
		// (or) Arrays.sort(a,(o1,o2)->o2-o1);
		System.out.println(Arrays.toString(a));
  int[] b= {2,456,457,0};
  Arrays.sort(b);
	}
}
