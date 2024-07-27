package PS09_Hands_0n;

public class IndexExtra {
	static int ans(int[] A, int[] B) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i]) {
				return i;
			} else {
				continue;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = {3,5,7,9,11,13};
		int b[] = {3,5,7,11,13};

		
		// TODO Auto-generated method stub
//		int a[] = { 2, 4, 6, 8, 9, 10, 12 };
//		int b[] = { 2, 4, 6, 8, 10, 12 };
		System.out.print(ans(a, b));

	}

}
