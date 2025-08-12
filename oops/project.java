package oops;

public class project {
String projectname;
String projectid ;
public  project(String projectname,String projectid){
	this.projectname=projectname;
	this.projectid=projectid;
}
public void projectdetails() {
	System.out.println(projectname);
	System.out.println(projectid);
	
}
public static void main(String[] args) {
	project project=new project("water","px12");
	project_manager projectmanager =new project_manager("john",1234, project);
	projectmanager.projectdetails();
}
}
