package PS09_Hands_0n;

public class Sqrt {
	static int ans2(int x) {
		if (x < 0) {
			return 0;
		}
		if (x == 1 || x == 0) {
			return x;
		}
		int s = 1, e = x, res = 0;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (mid == (x / mid)) {
				return mid;
			}
			if (mid <(x / mid)) {
				s = mid + 1;
				res = mid;
			} else {
				e = mid - 1;
			}
		}
		return res;

	}

	static int ans(int x) {
		if (x < 0) {
			return -1;
		} else {
			return (int) Math.sqrt(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		System.out.print(ans2(x));
	}

}
