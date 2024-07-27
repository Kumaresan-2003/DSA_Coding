public class RecursionBS {
	static int BS(int[] arr, int key, int low, int high) {
		// int low = 0, high = arr.length - 1;
		if (low > high) {
			return -1;
		}
		int mid = low + (high - low) / 2;
		if (arr[mid] == key) {
			return mid;
		} 
		else if (arr[mid] < key) {
			return BS(arr, key, mid + 1, high);
		} 
		
		else {
			return BS(arr, key, low, mid - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = 3;
		int i = BS(arr, n, 0, arr.length - 1);
		if (i == -1)
		{
			System.out.print("Element is not present in array");
		} else {
			System.out.print("Elements is found at " + i);
		}

	}

}
