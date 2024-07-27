
public class CountPrime {
	static boolean isprime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static int count(int l, int U) {
		int ct = 0;
		for (int i = l; i < U; i++) {
			if (isprime(i)) {
				ct++;
			}
		}
		return ct;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Count:" + count(3, 100));

	}

}
