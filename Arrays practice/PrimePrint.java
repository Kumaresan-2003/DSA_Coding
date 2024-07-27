import java.util.ArrayList;
import java.util.List;

public class PrimePrint {
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

	static List<Integer> count(int l, int U) {
		List<Integer> li=new ArrayList<>();
		for (int i = l; i < U; i++) {
			if (isprime(i)) {
				li.add(i);
			}
		}
		return li;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Count:" + count(1, 100));

	}

}
