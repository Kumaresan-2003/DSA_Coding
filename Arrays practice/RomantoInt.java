
public class RomantoInt{
	static int cal(char a){
       if(a=='I'){
       	return 1;
       }
       else if(a=='V'){
       	return 5;
       }
       else if(a=='X'){
       	return 10;
       }
       else if(a=='L'){
       	return 50;
       }
       else if(a=='C'){
       	return 100;
       }
       else if(a=='D'){
       	return 500;
       }
       else if(a=='M'){
       	return 1000;
       }
	return a;
	}
	public static int values(String str){
		int n=str.length(),i,v1,v2;
		int ans=0;
		for(i=0;i<n;i++){
			if(i<n-1){
				v1=cal(str.charAt(i));
				v2=cal(str.charAt(i));
				if(v1<v2){
					ans=ans-v1;
				}
				else{
					ans=ans+v1;
				}
			}
			else{
				ans=ans+cal(str.charAt(i));
			}
		}
		return ans;
	}

	public static void main(String args[]){
		String str="XLIV";
		String str1="X";
		System.out.println(str1+":"+values(str1));
		System.out.println(str+":"+values(str));


	}
}