package com_PS8_HS;

import java.util.Arrays;

public class SortIntegers {
	public int[] sortByBits(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            arr[i] += Integer.bitCount(arr[i]) * 100000;
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; ++i) {
            arr[i] %= 100000;
        }
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
