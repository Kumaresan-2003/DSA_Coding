package com_PS8_HS;

import java.util.*;
import Sortingsearch.Merge;

public class MergeSort {

	static void sol(int A[], int B[]) {
		int temp[] = new int[A.length + B.length];
		int i = 0;
		for (int b : A) {
			temp[i++] = b;
		}
		for (int b : B) {
			temp[i++] = b;
		}
		temp = Merge.alg(temp, temp.length);
		System.out.print(Arrays.toString(temp));

	}

	public static void main(String[] args) {
		// TODOnt Auto-generated method stub
		int A[] = { 10, 5, 15 };
		int B[] = { 20, 3, 2 };
		sol(A, B);
	}

}
