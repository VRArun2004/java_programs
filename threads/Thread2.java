package threads;

public class Thread2 extends Thread {
@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%2!=0) {
				System.out.println("Thread2 : "+i);
			}
		}
	}
}
