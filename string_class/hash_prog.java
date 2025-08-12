package string_class;

public class hash_prog {
public static void main(String[] args) {
	String s="abc##2xy";
	String s1="";
	
	for(char ch:s.toCharArray()) {
		if(ch=='#') {
			s1+=ch;
		}
	}
	for(char ch:s.toCharArray()) {
		if(ch!='#') {
			s1+=ch;
		}
	}
	System.out.println(s1);
}
}
