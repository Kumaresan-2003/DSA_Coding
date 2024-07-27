package PS09_Hands_0n;


import java.util.Scanner;

public class FindTransitionPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println(transitionPoint(arr, n));
	}
	static int transitionPoint(int arr[], int n) {
		for (int i =0; i<n; i++) {
			if(arr[i] == 1) {
				return i;
			}
		}
		return -1;
	}
}
