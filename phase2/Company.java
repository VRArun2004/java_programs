package phase2;

public class Company {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = emp;
		Employee emp2 = emp;
		Employee emp3 = emp;
		Employee emp4 = emp;
		Employee emp5 = emp;
		emp1.e_id = 420;
		emp1.e_name = "anujith";
		emp1.e_salary=50000;
		System.out.println(emp3.e_id);
		System.out.println(emp3.e_name);
		System.out.println(emp3.e_salary);
		emp4.e_id = 320;
		emp4.e_name = "arun";
		emp4.e_salary=80000;
		System.out.println(emp2);
		System.out.println(emp5.e_id);
		System.out.println(emp5.e_name);
		System.out.println(emp5.e_salary);
	}
}
