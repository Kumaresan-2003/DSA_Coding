package Com.handson;

public class StackArr {
	 static int top=-1;
	 static int maxcap;
	 static int[] starr;
	 StackArr(int maxcap){
		 this.maxcap=maxcap;
		 starr=new int[maxcap];
		 top=-1;
	 }	 
//1
public void push(int a) {
	if(isFull()) {
		System.out.println("Elements Cant Inserted");
		return;
	}
	else {
		starr[++top]=a;
		System.out.println("Elements is  Inserted");
		return;
	}
}
//2
public void pop() {
	if(isEmpty()) {
		System.out.print("Elements Cant Inserted");
		return;
	}
	else {
		top--;
		return;
	}
}
//3
public boolean isEmpty() {
	if(top==-1) {
		return true;
	}
	else {
		return false;
	}
}
//4
public boolean isFull() {
	if(top==maxcap) {
		return true;
	}
	else {
		return false;
	}
}
//5
public int  peek() {
	if(isEmpty()) {
		System.out.print("Empty List");
		return 0;
	}
	else {
		return starr[top];
	}
}
//6
public void display() {
	if(isEmpty()) {
		System.out.print("Empty List");
	}
	else {
		for(int i=top;i>=0;i--) {
			System.out.print(starr[i]+" ");
		}
	}
}
//7
public void size() {
	if(isEmpty()) {
		System.out.print("Empty List");
	}
	else {
		System.out.print(top);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArr ob=new StackArr(10);
		ob.push(10);
		ob.push(11);
		ob.push(12);
		ob.push(13);
		ob.push(14);
	    ob.display();
		
		//ob.pop();
		//ob.pop();
		//ob.display();
		ob.peek();
		
		ob.isEmpty();
		
		
		
		
		

	}

}
