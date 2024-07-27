package com_PS8_HS;

import java.util.Arrays;

public class WaveArr {
	public static int[] rearrange(int[] A) {
		for (int i = 0; i < A.length-1; i++) {
			// for even positioned items
			if (i % 2 == 0 && A[i] > A[i + 1]) {
				int temp = A[i];
				A[i] = A[i + 1];
				A[i + 1] = temp;
			}

			// for odd positioned items
			if (i % 2 == 1 && A[i] < A[i + 1]) {
				int temp = A[i];
				A[i] = A[i + 1];
				A[i + 1] = temp;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 3, 2, 5, 4, 1 };
		//System.out.print(Arrays.toString(arr));
		int[] res = rearrange(arr);
		System.out.print(Arrays.toString(res));

	}

}
