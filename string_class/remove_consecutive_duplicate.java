package string_class;

import java.util.Iterator;
import java.util.Stack;

public class remove_consecutive_duplicate {
public static void main(String[] args) {
	String s="abbaca";
	Stack<Character> stack=new Stack<>();
	for(char ch:s.toCharArray()) {
		if(!stack.isEmpty()&&stack.peek()==ch) {
			stack.pop();
		}else {
			stack.push(ch);
		}
	}
	StringBuilder s1=new StringBuilder();
	Iterator<Character> i= stack.iterator();
	while(i.hasNext()) {
	s1.append(i.next());
	
	}
	String str=s1.toString();
	System.out.println(str);
}
} 
