package lambda_expression;

public class driver_higher_order_fun {
	
public static void main(String[] args) {
	driver_higher_order_fun d=new driver_higher_order_fun();
	d.hof((a,b)->a*b,25,4);
	
	d.hof((a,b)->a+b,64,45);
	
	d.hof((a,b)->a-b, 454, 33);
	
	d.hof1((a,b)->a/b);
	
}
public void hof(higher_order_function i,int c,int d) {
	System.out.println(i.mul(c, d));
}
public void hof1(higher_order_function i) {
	System.out.println(i.mul(200, 34));
}

}
