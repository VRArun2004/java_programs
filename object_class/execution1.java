package object_class;

public class execution1 {
public static void main(String[] args) {
	Student stud=new Student(12,"gopal",50000.00);
	Student stud1=new Student(12,"gopal",50000.00);
	Student stud2=new Student(13,"gopal",60000.00);
	Student stud3=new Student(16,"gopal",70000.00);

System.out.println(stud.equals(stud1));
System.out.println(stud1.equals(stud2));
System.out.println(stud2.equals(stud3));
}
}
