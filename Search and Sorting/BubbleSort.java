
public class BubbleSort {
	//Intgers
	static void alg1(String[] arr, int n) {
	    int i = 0, j = 0;
	    boolean flag = false;
	    for (i = 0; i < n-1; i++) {
	        for (j = 0; j < n - i - 1; j++) {
	            if (arr[j].compareTo(arr[j + 1]) > 0) {    
	                String temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	            
	            System.out.println("Iteration Number " + i + " ");
	            for (String h : arr) {
	                System.out.print(h + " ");
	            }
	            System.out.println();
	        }
	    }
	}
	// char bubble
	static void alg3(char[] arr, int n) {
	    int i = 0, j = 0;
	    for (i = 0; i < n - 1; i++) {
	        for (j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {    
	                char temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	            
	            System.out.println("Iteration Number " + i + " ");
	            for (char h : arr) {
	                System.out.print(h + " ");
	            }
	            System.out.println();
	        }
	    }
	}

	static void alg(int[] arr, int n) {
		int i = 0, j = 0;
		//boolean flag=false;
		for (i = 0; i < n-1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {	
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
				System.out.println("iteration Number" + i + " ");
				for (int h : arr) {
					System.out.print(h + " ");
				}
				System.out.println();

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 9, 8, 1, 3 };
		int n = arr.length;
		System.out.println();
	    alg(arr, n);
		
		String[] arr2= { "banana", "apple", "grape", "cherry", "mango" };
        int m = arr2.length;
        alg1(arr2, m);
        
        char[] str = { 'c', 'd', 'e', 'g', 'h', 'a' };
		int K = str.length;
		alg3(str,K);
		

	}

}
