package oops;


public class Student {
	int s_id;
	String s_name;
	long s_mobile;
	String s_mail;
	public void createstudent(Student student,int s_id,String s_name,long s_mobile,String s_mail) {
		this.s_id=s_id;
		this.s_name=s_name;
		this.s_mobile=s_mobile;
		this.s_mail=s_mail;
	}
	public static Student create_new_student() {
		new Student();
		return new Student();
	}
	public void display() {
		System.out.println(s_id);
		System.out.println(s_name);
		System.out.println(s_mobile);
		System.out.println(s_mail);
	}
}
