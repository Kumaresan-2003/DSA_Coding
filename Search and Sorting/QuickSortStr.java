
import java.util.Arrays;
public class QuickSortStr {
	static void partition(String[] ch, int l, int h) {
		int s = l;
		int e = h;
		int mid =s + (e - s) / 2;
		String  pivot = ch[mid];
		if (l >= h) {
			return;
		}
		
		while (s <= e) {
			while (ch[s].compareTo(pivot)<0) {
				s++;
			}
			while (ch[e].compareTo(pivot)>0) {
				e--;
			}
			if (s <= e) {
				String temp = ch[s];
				ch[s] = ch[e];
				ch[e] = temp;
				s++;
				e--;
			}
		}
		partition(ch, l, e);
		partition(ch, s, h);
		//System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr2= { "banana", "apple", "grape", "cherry", "mango" };
        int m = arr2.length;
		partition(arr2, 0, m-1);
		System.out.println("Ascending Order:");
		System.out.println(Arrays.toString(arr2));
		System.out.println("Descending Order:");
		int i=0,j=m-1;
		while(i<j) {
			String  a= arr2[i];
			arr2 [i]=arr2 [j];
			arr2[j]=a;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr2));
	}

}
