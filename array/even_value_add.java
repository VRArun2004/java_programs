package array;

public class even_value_add {
	public static void main(String[] args) {
		int[] a= {10,21,30,43,50,60,7,80};
		int res=even(a);
		System.out.println(res);
	}
public static int even(int[] a) {
	int sum=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			sum=sum+a[i];
		}
	}
	return sum;
}
}
