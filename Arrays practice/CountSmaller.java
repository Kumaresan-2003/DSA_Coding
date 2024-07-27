package com_PS8_HS;
//import SortingAlg.Mergesort;
import java.util.Arrays;

public class CountSmaller {
	static void sol(int arr[], int n) {
		int temp[] = new int[n];
	     //int res[]=divide(arr, 0, arr.length);
		for (int i = 0; i < n; i++) {
			int ct = 0;
			for (int j = 0; j < n; j++) {
				if (i!=j&&arr[i] > arr[j]) {
					ct++;
				}
			}
			temp[i] = ct;

		}
		System.out.print(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 8, 1, 2, 2, 3 };
		int nums2[]= {6,5,4,8};
		sol(nums2, nums2.length);

	}

}
