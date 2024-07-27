package PS09_Hands_0n;

public class SpecialArray {
	public static int specialArray(int[] arr) {
		int len = arr.length;
		for (int i = 1; i < 1001; i++) {
			int ct = 0;
			for (int j = 0; j < len; j++) {
				if (arr[j] >= i) {
					ct++;
				}
			}
			if (ct == i) {
				return ct;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {0,0};
		System.out.print(specialArray(arr));

	}

}
