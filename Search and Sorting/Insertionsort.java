import java.util.Arrays;

public class Insertionsort {
	static void Stringarr(String[] str,int n) {
		int i;
		for(i=1;i<n;i++) {
			String key=str[i];
			int j=i-1;
			while(j>=0 && str[j].compareTo(key)>0) {
				str[j+1]=str[j];
				j--;
			}
			str[j+1]=key;
			System.out.println(i+" "+Arrays.toString(str));
		}
	}
	static void insert2(char[] str, int n) {
		int i;
		for (i = 1; i < n; i++) {
			// Extract the elements
			char key = str[i];
			int j = i - 1;
			while (j >= 0 && str[j] > key) {
				str[j + 1] = str[j];
				j--;
			}
			str[j + 1] = key;
			System.out.println(i + " " + Arrays.toString(str));
		}
		// System.out.print(Arrays.toString(arr));
	}

	static void insert(int[] arr, int n) {
		int i;
		for (i = 1; i < n; i++) {
			// Extract the elements
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j+1]=key;
			System.out.println(i + " " + Arrays.toString(arr));
		}
		// System.out.print(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		insert(arr, N);
		
		char[] str = { 'c', 'd', 'e', 'g', 'h', 'a' };
		int K = str.length;
	    insert2(str, K);
		
		String[] arr2= { "banana", "apple", "grape", "cherry", "mango" };
        int m = arr2.length;
        Stringarr(arr2, m);
		

	}

}
