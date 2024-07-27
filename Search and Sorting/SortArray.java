package com_PS8_HS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {
	static void ans(int[] arr, int n) {
		List<Integer> li= new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();
		// List<Integer> li2=new ArrayList<>();
		int[] temp = new int[n];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				li.add(arr[i]);
			} else {
				li2.add(arr[i]);
			}
		}
		Collections.sort(li);
		for (int i : li) {
			System.out.print(i + " ");
		}
		for (int i : li2) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 3, 1, 2, 4, };
		ans(nums, nums.length);
		System.out.print(Arrays.toString(nums));

	}

}
