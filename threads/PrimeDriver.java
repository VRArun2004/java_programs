package threads;

public class PrimeDriver {
	public static void main(String[] args) {

		int start = 20;
		int end = 120;

		Thread[] t1 = new Thread[end - start];
		int k = 0;
		for (int i = start; i < end; i++) {
			t1[k++]=new Prime(i);
		}
		for(int i=0;i<t1.length;i++) {
		t1[i].start();
		}
	}
}