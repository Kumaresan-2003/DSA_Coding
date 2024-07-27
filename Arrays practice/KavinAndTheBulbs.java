package com.Handson;

import java.util.Scanner;

public class KavinAndTheBulbs {

    // Function to count the number of good bulbs
    public static int countGoodBulbs(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        System.out.print("Enter the number of test cases: ");
        int testCases = scanner.nextInt();
        
        int[] results = new int[testCases];
        
        // Process each test case
        for (int i = 0; i < testCases; i++) {
            System.out.print("Enter the number of bulbs for test case " + (i + 1) + ": ");
            int n = scanner.nextInt();
            results[i] = countGoodBulbs(n);
        }
        
        // Print the results for each test case
        System.out.println("Results:");
        for (int result : results) {
            System.out.println(result);
        }
        
        scanner.close();
    }
}
	
