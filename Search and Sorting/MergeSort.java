import java.util.Arrays;

public class MergeSort {
	static void divide(int[] arr, int start, int end) {
		if (end - start == 1) {
			return;
		}

		int mid = (start + end) / 2;

		divide(arr, start, mid);
		divide(arr, mid, end);                                                                                             

		merge(arr, start, mid, end);
		System.out.println(Arrays.toString(arr));

	}

	static void merge(int[] arr, int start, int mid, int end) {
		int[] temp = new int[end - start];
		int i = start, j = mid, k = 0;                                                                                       
		while (i < mid && j < end) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}
		}
		while (i < mid) {
			temp[k++] = arr[i++];
		}
		while (j < end) {
			temp[k++] = arr[j++];
		}
		System.out.println(Arrays.toString(temp));
		System.arraycopy(temp, 0, arr, start, temp.length);
		// System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 6, 2, 5, 7 };
		divide(arr, 0, arr.length);
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}
}
