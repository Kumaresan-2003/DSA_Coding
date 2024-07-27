
class Solution {

	public int[] sortArrayByParity(int[] nums) {

		int left = 0, right = nums.length - 1;

		while (left < right) {

			if (nums[left] % 2 == 1) {

				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;

				right--;
			} else {

				left++;
			}
		}

		return nums;
	}
}