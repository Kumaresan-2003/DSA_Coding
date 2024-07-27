package PS09_Hands_0n;


import java.util.Scanner;

public class SingleElementinaSortedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println(SingleElement(arr, n));
	}
	static int SingleElement(int arr[], int n) {
		int low = 0;
		int high = n -1;
		while(low < high) {
			int mid = (low+high)/2;
			if(mid %2 == 0) {
				if (arr[mid] == arr[mid + 1]) {
					low = mid +1;
				}
				else {
					high = mid - 1;
				}
			}
			else {
				if (arr[mid] == arr[mid-1]) {
					low = mid + 1;
				}
				else {
					high = mid -1;
				}
			}
		}
		return arr[low];
	}
}
