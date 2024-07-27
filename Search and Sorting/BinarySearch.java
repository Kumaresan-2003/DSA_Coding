
public class BinarySearch {
    static int BS(int [] arr,int key) {
    	int low=0, high=arr.length-1;	
    	while(low<=high){
    		int mid=(low+high)/2;
    		if(arr[mid]==key){
    			return arr[mid];
    		}
    		
    		else if(arr[mid]<key) {
    			low=mid+1;
    		}
    		else {
    			high=mid-1;
    		}
    	}
    	
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 4, 10, 40 };
        int n =10;
        int i=BS(arr,n);
        if(i==-1) {
        	System.out.print("Element is not present in array");
        }
        else {
        	System.out.print("Elements is found at "+i);
        }
        

	}

}
