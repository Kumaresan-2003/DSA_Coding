package com_PS8_HS;

import java.util.HashSet;

public class FindDifference {
	static void ans(String s, String t) {
		if(t.length()!=s.length()+1) {
			return;
		}
		if(!(s.length()<=1000)) {
			return ;
		}
		HashSet<Character> s1=new HashSet<>();
	    for(int i=0;i<s.length();i++) {
	    	s1.add(s.charAt(i));
	    }
	    for(int i=0;i<t.length();i++) {
	    	boolean flag=s1.add(t.charAt(i));
	    	if(flag) {
	    		System.out.print(t.charAt(i));
	    	}
	    	else {
	    		continue;
	    	}
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //String s = "abcd", t = "abcde";
		 String s="",t="y";
		 ans(s,t);
	}

}
