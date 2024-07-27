import java.util.Arrays;
public class QuickSort2 {
	static void partition(int[] arr, int l, int h) {
		int s = l;
		int e = h;
		int mid =s + (e - s) / 2;
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
		partition(arr, l, e);
		partition(arr, s, h);
		//System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,-1,-2,-4 };
		partition(arr, 0, arr.length-1);
		System.out.println("Ascending Order:");
		System.out.println(Arrays.toString(arr));
		System.out.println("Descending Order:");
		int i=0,j=arr.length-1;
		while(i<j) {
			int a=arr[i];
			arr[i]=arr[j];
			arr[j]=a;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
