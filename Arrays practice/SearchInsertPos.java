package PS09_Hands_0n;

public class SearchInsertPos {
	static int ans(int[] arr, int k) {
		int l = 0, h = arr.length - 1;
		int ans = arr.length;
		while (l < h) {
			int mid = (l + h) / 2;
			if (arr[mid] >= k) {
				ans = mid;
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 5, 6 };
		int k = 7;
		System.out.print(ans(nums, k));

	}

}
