import java.util.Arrays;

public class MergesortChar {
    static void divide(char[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;
        
        divide(arr, start, mid);
        divide(arr, mid, end);
        
        merge(arr, start, mid, end);
        System.out.println(Arrays.toString(arr));
    }

    static void merge(char[] arr, int start, int mid, int end) {
        char[] temp = new char[end - start];
        int i = start, j = mid, k = 0;
        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
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
        char[] arr = { 'g', 'e', 'b', 'a', 'f', 'c', 'd' };
        divide(arr, 0, arr.length);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
