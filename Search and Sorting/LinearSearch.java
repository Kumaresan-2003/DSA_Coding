
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {-1,0,3,5,9,12};
		int target=10;
		int i;
		boolean flag=false;
		for(i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				System.out.print("Element is present "+i);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.print("Element is not present at index\r");
		}

	}

}
