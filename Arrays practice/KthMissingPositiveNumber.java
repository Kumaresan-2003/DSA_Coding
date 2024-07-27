package com.Handson;

import java.util.Scanner;

public class KthMissingPositiveNumber {
	static int missingNumber(int arr[], int n, int k) {
		int left = 0;
		int right = n - 1;
		while (left <= right) {
			int mid = (left + right)/2;
			int missing = arr[mid] -(mid+1);
			if(missing < k) {
				left = mid + 1; 
			}
			else {
				right = mid -1;
			}
		}
		return k+right+1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println(missingNumber(arr, n, k));
	}
}
