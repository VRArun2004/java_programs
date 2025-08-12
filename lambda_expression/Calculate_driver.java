package lambda_expression;

import java.util.Scanner;

public class Calculate_driver {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the elements to calculate :");
	int a=scan.nextInt();
	int b=scan.nextInt();
	Calculate add=(c,d)->{System.out.print("add : ");
		System.out.println(a+b);};
	Calculate sub=(c,d)->{System.out.print("sub : ");
		System.out.println(a-b);};
	Calculate mul=(c,d)->{System.out.print("mul : ");
		System.out.println(a*b);};
	Calculate div=(c,d)->{System.out.print("div : ");
		System.out.println(a/b);};
	add.display(a, b);
	sub.display(a, b);
	mul.display(a, b);
	div.display(a, b);
	
	System.out.println("-----using implicite return-----");

	Calculate_return add1=(c,d)->c+d;
	Calculate_return sub1=(c,d)->c+d;
	Calculate_return mul1=(c,d)->c+d;
	Calculate_return div1=(c,d)->c+d;
	System.out.println(add1.display(a, b));
	System.out.println(sub1.display(a, b));
	System.out.println(mul1.display(a, b));
	System.out.println(div1.display(a, b));
}
}
