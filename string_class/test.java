package string_class;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class test {
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter string:");
	        String s = scan.next();

	        if (isBalanced(s)) {
	            System.out.println("True");
	        } else {
	            System.out.println("False");
	        }
	        scan.close();
	    }

	    public static boolean isBalanced(String s) {
	        Map<Character, Character> bracketMap = new HashMap<>();
	        bracketMap.put(')', '(');
	        bracketMap.put(']', '[');
	        bracketMap.put('}', '{');

	        Stack<Character> stack = new Stack<>();

	        for (char ch : s.toCharArray()) {
	            if (bracketMap.containsValue(ch)) {
	                // opening bracket
	                stack.push(ch);
	            } else if (bracketMap.containsKey(ch)) {
	                // closing bracket
	                if (stack.isEmpty() || stack.pop() != bracketMap.get(ch)) {
	                    return false;
	                }
	            }
	        }

	        return stack.isEmpty();
	    }
	
	}


