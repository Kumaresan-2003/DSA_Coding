package PS09_Hands_0n;


import java.util.Scanner;

public class FrequencyInSortedArray {

    public static int countOccurrences(int[] arr, int x) {
        int first = binarySearchFirst(arr, x);
        if (first == -1) {
            return 0;  // X is not found in the array
        }

        int last = binarySearchLast(arr, x);
        return last - first + 1;
    }

    private static int binarySearchFirst(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int firstOccurrence = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                firstOccurrence = mid;
                right = mid - 1;  // Continue to search in the left half
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstOccurrence;
    }

    private static int binarySearchLast(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int lastOccurrence = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                lastOccurrence = mid;
                left = mid + 1;  // Continue to search in the right half
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastOccurrence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter number of test cases: ");
        int t = scanner.nextInt();

        while (t-- > 0) {
//            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
//            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

//            System.out.print("Enter the number to count occurrences of: ");
            int x = scanner.nextInt();

            int count = countOccurrences(arr, x);
            System.out.println(count);
        }
    }
}
