package com.array;
class Array{
	static int size;
	static int maxcap;
	static int [] list;
	Array(int maxcap){
		this.maxcap=maxcap;
		list=new int[maxcap];
		size=0;
	}
	static void insertatbegin(int val) {
		if(size==maxcap) {
			System.out.print("List is full");
		}
		else {
			for(int i=size;i>0;i--) {
				list[i]=list[i-1];
			}
			list[0]=val;
			size++;
		}	
	}
	static void Arrprint() {
		for(int i=0;i<size;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
	static void insertatend(int val) {
		if(size==maxcap) {
			System.out.print("List is full");
		}
		else {
			list[size++]=val;
		}
	}
	static void insertatpos(int pos,int val) {
		if(size==maxcap) {
			System.out.print("List is full");
		}
		if(pos<0 || pos>maxcap) {
			System.out.print("Index out of bound");
		}
		for(int i=size;i>pos;i--) {
			list[i]=list[i-1];
		}
		list[pos]=val;
		size++;
	}
	static boolean isEmpty(int size) {
		if(size==0) {
			return true;
		}
		else {
			return false;
		}
	}
	static void deleteatpos(int pos) {
	   if(isEmpty(size)) {
		   System.out.print("deletion cant done");
	   }
	   if(pos<0 || pos>=maxcap) {
		   System.out.print("Position is Not found");
	   }
	   
	   else {
		   for(int i=pos;i<size-1;i++) {
			   list[i]=list[i+1]; 
		   }
		   size--;
	   }
	}
	
}
public class ArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array ob=new Array(10);
		ob.insertatbegin(12);
		ob.insertatbegin(13);
		ob.insertatbegin(14);
		ob.insertatbegin(15);
		ob.insertatbegin(17);
		ob.Arrprint();
		ob.insertatpos(2,5);
		ob.Arrprint();
		ob.insertatend(70);
		ob.Arrprint();
		
		ob.deleteatpos(6);
		ob.Arrprint();
		
		
		
		

	}

}
