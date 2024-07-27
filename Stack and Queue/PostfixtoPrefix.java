package Com.handson;

import java.util.Scanner;
import java.util.Stack;

public class PostfixtoPrefix {
	public static void main(String[] args) {
		
		Stack<String> st = new Stack<>();
		System.out.print("Enter the postfix expression: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String res = "";
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
				res = "";
				String op1 = st.peek();
				st.pop();
				String op2 = st.peek();
				st.pop();
				res = s.charAt(i) + op2 + op1;
				st.push(res);
			} else {
				String s1 = "";
				s1 += s.charAt(i);
				st.push(s1);
			}
		}
		System.out.println("Conversion : " + st.pop());

	}
}
