
import java.util.Arrays;
public class QuickCharsort {
	static void partition(char[] ch, int l, int h) {
		int s = l;
		int e = h;
		int mid =s + (e - s) / 2;
		int pivot = ch[mid];
		if (l >= h) {
			return;
		}
		while (s <= e) {
			while (ch[s] < pivot) {
				s++;
			}
			while (ch[e] > pivot) {
				e--;
			}
			if (s <= e) {
				char temp = ch[s];
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
		char[] ch = {'a','d','e','l','h','f','j'};
		partition(ch, 0, ch.length-1);
		System.out.println("Ascending Order:");
		System.out.println(Arrays.toString(ch));
		System.out.println("Descending Order:");
		int i=0,j=ch.length-1;
		while(i<j) {
			char a=ch[i];
			ch[i]=ch[j];
			ch[j]=a;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(ch));
	}

}
