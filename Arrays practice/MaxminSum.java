public class MaxminSum {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 8, 7, 6, 5 };
		int mini_sum=Integer.MAX_VALUE;
		int max_sum=Integer.MIN_VALUE;
		 for(int i=0;i<arr.length;i++) {
			 int sum=0;
			 for(int j=0;j<arr.length;j++) {
				 if(i==j) {
					 continue;
				 }
				 else {
					 sum+=arr[j];
				 }
				 
			 }
			 mini_sum=Math.min(sum, mini_sum);
			 max_sum=Math.max(sum,max_sum);
		 }
		 System.out.println(mini_sum+" ");
		 System.out.println(max_sum+" ");
		
	}

}
