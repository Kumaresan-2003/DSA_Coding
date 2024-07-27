public class SelfStudy {

	public static int linearSearch(double[] scores, double target) {
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(double[] scores, double target) {
		int left = 0;
		int right = scores.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (scores[mid] == target) {
				return mid;
			}

			if (scores[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		double[] scores = { 45.5, 56.1, 67.3, 78.2, 89.1, 90.2, 91.7, 92.9, 93.6, 94.3, 95.7, 96.2, 97.3, 98.6, 99.7,
				100 };
		double target = 91.0;

		// Linear Search
		int linearIndex = linearSearch(scores, target);
		if (linearIndex != -1) {
			System.out.println("Linear Search: Score " + target + " found at index " + linearIndex);
		} else {
			System.out.println("Linear Search: Score " + target + " not found.");
		}

		// Binary Search
		int binaryIndex = binarySearch(scores, target);
		if (binaryIndex != -1) {
			System.out.println("Binary Search: Score " + target + " found at index " + binaryIndex);
		} else {
			System.out.println("Binary Search: Score " + target + " not found.");
		}
	}
}
