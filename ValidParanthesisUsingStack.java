package string;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesisUsingStack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		boolean isValid = validParentheses(s);
		System.out.println(isValid);

	}
	
	public static boolean validParentheses(String s) {
		if(s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> st = new Stack<>();
		int i = 0;
		while(i < s.length()) {
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				st.push(s.charAt(i));
				i++;
			}
			else {
				if(!st.isEmpty()) {
					if(s.charAt(i) == ')' && st.peek() == '(') {
						st.pop();
						i++;
					}else if(s.charAt(i) == ']' && st.peek() == '[') {
						st.pop();
						i++;
					}else if(s.charAt(i) == '}' && st.peek() == '{') {
						st.pop();
						i++;
					}else {
						return false;
					}
					
				}else {
					return false;
				}
			}
		}
		
		
		return st.isEmpty();
	}

}
