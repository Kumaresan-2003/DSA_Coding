package com_PS8_HS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArraybyFreq {
    static void frequencySort(int[] nums) {
 
        int[] frequency = new int[201];
        List<Integer> transformedList = new ArrayList<>();
      
        for (int num : nums) {
            num += 100; 
            ++frequency[num];
            transformedList.add(num); 
        }
      
        transformedList.sort((a, b) ->
            // If frequencies are the same, sort in descending order of the values (b - a).
            // Otherwise, sort by ascending order of frequencies (cnt[a] - cnt[b]).
            frequency[a] == frequency[b] ? b - a : frequency[a] - frequency[b]
        );
      
        int[] sortedArr = new int[nums.length];
        int i = 0;

        for (int val : transformedList) {
            sortedArr[i++] = val-100;
        }
        System.out.print(Arrays.toString(sortedArr));
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-1,1,-6,4,5,-6,1,4,1};
		frequencySort(nums);
		//System.out.print(Arrays.toString(nums));

	}
}
