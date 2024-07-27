package com_PS8_HS;

import java.util.Arrays;

public class SortingSentences {
	static void ans(String s) {
		String str[] = s.split("\\s+");
		//System.out.print(Arrays.toString(str));
		String[] res = new String[str.length];
		//System.out.print(str.length);
		int i = 0;
		StringBuilder sb = new StringBuilder();
		for (String ele : str) 
		{
			//i = (int) (elem.charAt(elem.length() - 1) - '0'); 
			i = (int) (ele.charAt(ele.length() - 1)-'0');
			//System.out.print(i);
			res[i-1] = ele.substring(0, ele.length()-1);
			//System.out.print(res[i-1]);
		}
		
		for (int j = 0; j < res.length-1; j++) {
			sb.append(res[j]).append(" ");
		}
		sb.append(res[i]);
		
		System.out.print(sb.toString());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "is2 sentence4 This1 a3";
		ans(s);
		String s1 = "Myself2 Me1 I4 and3";
		ans(s1);
	}

}
