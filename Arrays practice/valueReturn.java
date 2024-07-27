package PS09_Hands_0n;

public class valueReturn {
	static int ans(int [] arr,int n)
	{
		for(int i=0;i<n;i++) {
			if(arr[i]==(i+1)) 
			{
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[] = {15, 2, 45, 12, 7};
		System.out.print(ans(Arr,Arr.length));
	}

}
