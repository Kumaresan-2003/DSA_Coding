package com.Handson;
import java.util.Scanner;

public class HIndexII {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] >= n - mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return n - left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of citations:");
        int n = scanner.nextInt();
        int[] citations = new int[n];
        System.out.println("Enter the citation counts:");
        for (int i = 0; i < n; i++) {
            citations[i] = scanner.nextInt();
        }

        int result = hIndex(citations);
        System.out.println("The researcher's h-index is: " + result);
        
        scanner.close();
    }
}
