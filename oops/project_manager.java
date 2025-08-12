package oops;

public class project_manager {
 String name;
 int empid;
 project project;
public project_manager(String name,int empid,project project) {
	this.name=name;
	this.empid=empid;
	this.project=project;
}
public void projectdetails() {
	System.out.println(name);
	System.out.println(empid);
	System.out.println();
	project.projectdetails();
}

}
