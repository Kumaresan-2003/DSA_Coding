import java.util.Arrays;

public class QuickSort {
	static void alg(int[] arr, int l, int h) {
		int s = l;
		int e = h;
		int mid = (s + e) / 2;
		int pivot = arr[mid];
		if (l >= h) {
			return;
		}
		while (s <= e) {
			while (arr[s] < pivot) {
				s++;
			}
			while (arr[e] > pivot) {
				e--;
			}
			if (s <= e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				s++;
				e--;
			}
		}
		alg(arr, l, e);
		// System.out.println(l+" "+e);
		alg(arr, s, h);
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -4, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		alg(arr, 0, arr.length - 1);

	}

}
