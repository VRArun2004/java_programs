package string_class;

import java.util.Arrays;

public class String_methods {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		String s3="I love india so much";
		System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.toCharArray());
		System.out.println(s1.charAt(2));
		System.out.println(s2.getBytes());
		System.out.println(s2.trim());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.concat(" on fire"));
		System.out.println(s1.substring(3));
		System.out.println(s2.substring(1, 3));
		System.out.println(s1.indexOf(s2));
		System.out.println(s2.lastIndexOf(s1));
		System.out.println(s1.length());
		System.out.println(s1.contains(s2));
		System.out.println(s2.split(s1));
		System.out.println(s1.isEmpty());
		System.out.println(s2.replaceAll("cat", "walk"));
		System.out.println(s1.replace('d', 'f'));
		System.out.println(s2.replaceFirst("dog", "bark"));
		System.out.println(s1.startsWith("jio"));
		System.out.println(s2.endsWith("paris"));
		System.out.println(s1.equals(s2));
		/*split a string according to the character */
		String [] ar=s3.split("o");
		System.out.println(Arrays.toString(ar));
		String ak="programming";
	    String akk=ak.substring(4, 8);
	    System.out.println(akk);
	    String n="Student@123";
	   int h= n.hashCode();
	   System.out.println(h);
	}
}
