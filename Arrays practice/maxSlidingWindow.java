import java.util.*;

public class maxSlidingWindow {

	public static void main(String args[]) {
		int i, k = 3;
		int arr[] = { 4, 0, -1, 3, 5, 3, 6, 8 };
		int n = arr.length;
		ArrayList<Integer> ans;
		ans = maxSlidingWindow(arr, k, n);
		System.out.println("Maximum element in every " + k + " window ");

		for (i = 0; i < ans.size(); i++)
			System.out.print(ans.get(i) + "  ");

	}

	private static ArrayList<Integer> maxSlidingWindow(int[] arr, int k, int n) {
		// TODO Auto-generated method stub
//		int max = 0;
//		ArrayList<Integer> li = new ArrayList<>();
//		for (int i = 0; i <n-2; i++) {
//			for (int j = i + 1; j < n-1; j++) {
//				max=Math.max(arr[i], arr[j]);
//				for (int h = j + 1; h < n; h++) {
//					max = Math.max(max, arr[h]);
//				}
//				li.add(max);
//			}
//		}
//		System.out.print(li);
//		return li;
		ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            int max = 0;
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max)
                    max = arr[j];
            }
            li.add(max);
        }
        return li;
	}
}
