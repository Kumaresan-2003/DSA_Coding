package PS09_Hands_0n;

import java.util.*;

public class InfiniteSort {
	public static int binarySearch(int[] arr, int low, int high, int key) {
		while (low <= high) {

			int mid = (low + high) / 2;
			if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

	public static int findIndex(int[] arr, int key) {
		int low = 0;
		int high = 1;
		while (arr[high] < key) {
			low = high;
			high = 2 * high;
		}
		return binarySearch(arr, low, high, key);
	}

	public static void main(String args[]) {
		// Your code goes here
		int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };

		int ans = findIndex(arr, 130);

		System.out.println("Element found at index " + ans);
	}
}