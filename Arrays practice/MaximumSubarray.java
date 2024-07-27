//Write a Java program to 
//find the maximum sum of a contiguous subarray of length k
//from a given integer array.
public class MaximumSubarray {
//	static long maximum(ArrayList<Integer> arr,int n,int k) {
//		if(arr.size()==0|| k<=0||k<n) {
//			return (long)-1;
//		}
//		long sum=0;
//		for(int i=0;i<k;i++) {
//			sum+=arr.get(i);
//		}
//		long max_sum=sum;
//		int st=0;
//		for(int i=k;i<n;i++) {
//			sum=sum+arr.get(i)-arr.get(st);
//			st++;
//			if(sum>max_sum)
//		}
//	}
	static int subarray(int arr[], int n, int k) {
		if (k <= 0) {
			return 0; // Handle edge case when k is non-positive
		}
		int max_sum = Integer.MIN_VALUE;
		for (int i = 0; i + k <= n; i++) {
			int temp = 0;
			for (int j = i; j < i + k; j++) {
				temp += arr[j];
			}
			if (temp > max_sum) {
				max_sum = temp;
			}
		}
		return max_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 5, 1, 3, 2};
		// k is lenght of sub array in
		System.out.print(subarray(arr, 6, 3));
	}

}

