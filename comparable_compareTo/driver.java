package comparable_compareTo;

import java.util.Arrays;

public class driver {
public static void main(String[] args) {
	Student[] s=new Student[3];
	s[0]=new Student(30, "chandru");
	s[1]=new Student(24, "arun");
	s[2]=new Student(21, "hitesh");
	Arrays.sort(s);
	System.out.println(Arrays.toString(s));
}
}
