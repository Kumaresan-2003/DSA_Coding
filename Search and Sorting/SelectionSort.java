import java.util.*;

public class SelectionSort {
	static void alg(int[] arr, int n) {
		int i;
		for (i = 0; i < n; i++) {
			// Exxtract the Position
			int pos = i;
			for (int j = i + 1; j < n; j++) {
				// running the Remainig elements
				if (arr[pos] > arr[j]) {
					// Condition for Larger elements
					pos = j;
				}
			}
			// for Swap the Elements pos with i
			int temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
			System.out.println(i + " " + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

	static void strChar(String[] arr, int n) {
		int i;
		for (i = 0; i < n; i++) {
			// Extract the Position
			int pos = i;
			for (int j = i + 1; j < n; j++) {
				// Running the Remaining elements
				if (arr[pos].compareTo(arr[j]) > 0) {
					// Condition for Larger elements
					pos = j;
				}
			}
			// Swap the Elements pos with i
			String temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
			System.out.println(i + " " + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

	static void CharArray(char[] arr, int n) {
		int i;
		for (i = 0; i < n; i++) {
			// Extract the Position
			int pos = i;
			for (int j = i + 1; j < n; j++) {
				// Running the Remaining elements
				if (arr[pos] > arr[j]) {
					// Condition for Larger elements
					pos = j;
				}
			}
			// Swap the Elements pos with i
			char temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
			System.out.println(i + " " + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 4, 1, 3, 9, 7 };
		int n = arr.length;
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		System.out.println("After Sorting");
		alg(arr, n);

		char[] ch = { 'a', 'd', 'e', 'l', 'h', 'f', 'j' };
		CharArray(ch, ch.length);

		String[] str = { "banana", "apple", "grape", "cherry", "mango" };
		strChar(str, str.length);

	}

}
