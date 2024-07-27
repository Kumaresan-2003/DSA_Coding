package com_PS8_HS;
import Sortingsearch.Merge;
public class LargeValue {
	static void sol(int[] res, int n) {
		int arr[]=Merge.alg(res, n);
		
		for (int i = 0; i < n; i++) {
			int ct = 0;
			for (int j =1; j < n; j++) {
				if (Math.abs(arr[i]) == Math.abs(arr[j])) {
					ct++;
				}
			}
			if (ct == 2) {
				System.out.print(Math.abs(arr[i]));
				break;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { -1, 2, -3, 3 };
		int nums2[] = {-1,10,6,7,-7,1};
        sol(nums2,nums2.length);
	}

}
