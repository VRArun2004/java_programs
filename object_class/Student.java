package object_class;

public class Student {
	int studid;
	String studname;
	double studfee;
	
	public Student(int studid, String studname, double studfee) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.studfee = studfee;
	}

	@Override
public boolean equals(Object obj) {
	Student stud = (Student) obj;
return (this.studid == stud.studid && this.studfee==stud.studfee);
	}
}
