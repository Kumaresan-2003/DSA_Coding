package PS09_Hands_0n;

import java.util.*;

public class Kthmissing {
	public static void sol(int[] arr, int k) {
		HashSet<Integer> hs = new HashSet<>();
		List<Integer> li = new ArrayList<>();
		for (int i : arr) {
			hs.add(i);
		}
		int m = (arr[arr.length - 1]) + k;
		// System.out.print(m);
		for (int i = 1; i <= m; i++) {
			boolean flag = hs.contains(i);
			if (!flag) {
				li.add(i);
			} else {
				continue;
			}
		}
		// System.out.print(li.size());
		System.out.print(li.get(k - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {1,2,3,4};
//		int k = 2;
		int []arr = {2,3,4,7,11};
	    int k = 5;
	    sol(arr,k);

	}

}
