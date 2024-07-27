import java.util.Arrays;

public class MergeSortString {
    static void divide(String[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;
        
        divide(arr, start, mid);
        divide(arr, mid, end);
        
        merge(arr, start, mid, end);
        System.out.println(Arrays.toString(arr));
    }

    static void merge(String[] arr, int start, int mid, int end) {
        String[] temp = new String[end - start];
        int i = start, j = mid, k = 0;
        while (i < mid && j < end) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j < end) {
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, start, temp.length);
    }

    public static void main(String[] args) {
        String[] arr = { "grape", "elephant", "banana", "apple", "fig", "cherry", "date" };
        divide(arr, 0, arr.length);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
