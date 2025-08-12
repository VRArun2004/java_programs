package exception_handling;

public class try_catch_finally extends class_cast_parent {
	public static void main(String[] args) {
		System.out.println("MAIN STARTS");
		try {
			System.out.println("try block start");
			System.out.println(1 / 0);
			System.out.println("try block ends");
		} catch (ArithmeticException ref) { // or catch(Exception ref){ }
			System.out.println("ArithmeticException : handled successfully"); // because Exception is the parent of																// ArithmeticException
		} finally {
			System.out.println("finally block");
		}
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException : handled successfully");
		} catch (Throwable e) {
			System.out.println("Throwable : handled successfully");
		}
		int[] a = { 1, 2, 4, 5 };
		try {
			System.out.println(a[5]);
		} catch (Throwable w) {
			System.out.println("ArrayIndexOutOfBoundsException : handled successfully");
		}
		String p = "java";
		try {
			System.out.println(p.charAt(5));
		} catch (Exception d) {
			System.out.println("StringIndexOutOfBoundsException : handled successfully");
		}
		class_cast_parent obj = new class_cast_parent();
		try {
			try_catch_finally obj1 = (try_catch_finally) obj;
			System.out.println(obj1);
		} catch (Exception n) {
			System.out.println("ClassCastException : handled successfully");
		}
		System.out.println("MAIN ENDS");
	}
}
