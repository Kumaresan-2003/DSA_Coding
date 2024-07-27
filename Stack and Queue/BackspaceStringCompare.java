package Com.handson;

import java.util.Scanner;
import java.util.Stack;

public class BackspaceStringCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st1 = new Stack<>();
		Stack<Character> st2 = new Stack<>();
		System.out.print("Enter the string1 : ");
		String s = sc.nextLine();
		System.out.print("Enter the string2 : ");
		String t = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				st1.pop();
			} else
				st1.push(s.charAt(i));
		}
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == '#') {
				st2.pop();
			} else
				st2.push(t.charAt(i));
		}
		if (st1.size() != st2.size())
			System.out.println(false);
		else {
			boolean flag = true;
			for (int i = 0; i < st1.size(); i++) {
				if (st1.get(i) != st2.get(i)) {
					flag = false;
					break;
				}
			}
			System.out.println(flag);
		}

	}
}
