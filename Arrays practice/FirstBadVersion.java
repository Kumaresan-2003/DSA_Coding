package com.Handson;

import java.util.Scanner;

public class FirstBadVersion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bad = sc.nextInt();
		System.out.println(isbad(n, bad));
	}
	public static int isbad(int num, int bad) {
		return bad;
	}
}
