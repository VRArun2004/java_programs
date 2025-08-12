package object_class;

public class execution {
public static void main(String[] args) {
	Employee e1=new Employee(21,"dhoni", 50000.43);
	Employee e2=new Employee(21,"rohit",4324.43);
	Employee e3=new Employee(22,"virat",5374.43);

	System.out.println(e1.equals(e2));
	System.out.println(e1.equals(e3));
}
}
