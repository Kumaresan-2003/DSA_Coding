package com_PS8_HS;

public class CountPairs {
	static void sol(int arr[], int n, int key) {
		if (arr.length == 1 && key > -50 && key <= 50 && arr.length <= 50) {
			return; 
		}
		int ct = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] < key) {
					ct++;
				}
			}
		}
		System.out.print(ct);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int [] nums= {-1,1,2,3,1};
		int[] nums = { -6, 2, 5, -2, -7, -1, 3 };
		int key = 67;
		sol(nums, nums.length, key);

	}

}
