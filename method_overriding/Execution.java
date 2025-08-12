package method_overriding;

public class Execution {
public static void main(String[] args) {
	System.out.println("AMAZON CLASS :");
	Amazon amazon=new Amazon();
	amazon.login("dt565", "R@334gffh");
	System.out.println();
	System.out.println("USER CLASS :");
	Amazon amaz=new User("104aksfdgfgi","A@8642ghuzch");
	amaz.login("104aksfdgfgi","A@8642ghuzch");
	System.out.println();
	System.out.println("ADMIN CLASS :");
	Amazon amaz1=new Admin("875gdfefh", "G@gdh");
	amaz1.login("875gdfgiefh", "G@6464hgdh");
}
}
