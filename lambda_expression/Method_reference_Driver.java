package lambda_expression;

public class Method_reference_Driver {
public static void main(String[] args) {
	//using method reference
	Method_reference_i1 i1=Method_reference_c1::sum;
	System.out.println(i1.add(234, 365));
	System.out.println("------------");
	//using lambda expression
	Method_reference_i1 i2=(a,b)->a+b;
	System.out.println(i2.add(234, 365));
}
}
