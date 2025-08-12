package leetcode;
import java.util.*;
public class find_common_odd_in_arrays {
public static void main(String[] args) {
	
	int[] a= {1,2,3,4,5};
	int[] b= {3,4,5,6,7};
	Arrays.sort(a);
	Arrays.sort(b);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(b));
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j]) {
				if(b[j]%2!=0) {
					System.out.print(b[j]+" ");
				}
			}
		}
	}

}
}
