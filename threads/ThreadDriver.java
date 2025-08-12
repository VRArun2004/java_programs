package threads;

public class ThreadDriver {
public static void main(String[] args)  {
	System.out.println("main start");
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
//	t1.start(); //all thread are executed simultaneously
//	t2.start();
//	t1.run();   //calling the thread entire thread is executed then another thread after that
//	t2.run();	
	t1.start();
	try {
		t1.join();     //use to run t1 fully and 
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t2.start();
	try {
		t2.join();     //use to run t1 fully and 
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("main end");
}
}
