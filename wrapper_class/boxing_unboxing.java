package wrapper_class;

public class boxing_unboxing {
	public static void main(String[] args) {
		int a=12;
		//boxing
		Integer i=new Integer(a);
		System.out.println("boxing : "+i);
		//Auto boxing
		Integer i1=a;
		System.out.println("Auto boxing : "+i1);
		//unboxing
		int b=i.intValue();
		System.out.println("unboxing : "+b);
		//Auto unboxing
		int c=i1;
		System.out.println("Auto unboxing : "+c);
	}
}
