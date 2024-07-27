import java.util.Arrays;

public class MaximumProduct {
	static void result(int[] arr) {
		int n=arr.length;
		int res[]=new int[n];
		//Arrays.sort(arr);
		for(int i=0;i<n;i++) {
				res[i]=Math.abs(arr[i]);
		}
		Arrays.sort(res);
		for(int i:res) {
			System.out.print(i+" ");
		}
		System.out.println("MaximumProductre: "+res[n-1]* res[n-2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -10, -3, 5, 6, -2 };
		result(arr);
		

	}

}
