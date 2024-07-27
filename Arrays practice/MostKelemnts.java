import java.util.*;

public class MostKelemnts {
	static void ans(int[] arr, int n,int k) {
       Map<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<n;i++) 
       {
    	   mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
       }
       List<Map.Entry<Integer,Integer>>list=new ArrayList<Map.Entry<Integer,Integer>>(mp.entrySet());
       
       Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
    	   public int compare(
    			   Map.Entry<Integer, Integer> o1, Map.Entry<Integer,Integer> o2) {
    		   if(o1.getValue().equals(o2.getValue()))
    			   return o2.getKey()-o1.getKey();
    		   else {
    			   return o2.getValue()-o1.getValue();
    		   }
    	   }
       });

       for(int i=0;i<k;i++) {
    	   System.out.print(list.get(i).getKey()+" ");
       }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.print("Enter the number of ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		while (i < n) {
			System.out.print("Enter element" + i + ":");
			arr[i]=sc.nextInt();
			i++;
		}
		System.out.print("Enter the number of ");
		int k = sc.nextInt();
        ans(arr,n,k);
	}

}
