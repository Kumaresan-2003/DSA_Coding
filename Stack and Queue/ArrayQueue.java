package Com.handson;

public class ArrayQueue {
	public static int front=-1;
	static int rear=-1;
	static int max;
	static int [] Arrqueue;
	ArrayQueue(int max){
		this.max=max;
		Arrqueue=new int[max];
	}
	//1 Push
	public static void Enqueue(int a) {
		if(isEmpty()) {
			front=0;
			rear=0;
			Arrqueue[rear]=a;
		}
		else {
			rear++;
			Arrqueue[rear]=a;
		}
		
	}
	//2
	public static void Dequeue() {
		if(isEmpty()) {
			System.out.print("Queue is Empty");
		}
		else {
			if(front>=rear) {
				front=-1;
				rear=-1;
			}
			else {
				front++;
				//rear--;
			}
		}
		
	}
	//3
	public static void peek() {
		 if(isEmpty()) {
			 return;
		 }
		 else {
			 System.out.println(Arrqueue[front]);
		 }
	}
	//4
	public static boolean isEmpty() {
		if(front==-1 && rear==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	//5
	public static boolean isFull() {
		if(rear==max-1) {
			return true;
		}
		else {
			return false;
		}
	}
	//6
	public static void display() {
		if(rear==-1) {
			System.out.print("Queue is Empty");
		}
		else {
			for(int i=front;i<=rear;i++) {
				System.out.print(Arrqueue[i]+" ");
			}
			System.out.println();
			
		}
	}
	//7
	public static void size() {
		if(isEmpty()) {
			System.out.print(front);
		}
		else {
			System.out.println(rear);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue ob=new ArrayQueue(10);
		//1
		ob.Enqueue(10);
		ob.Enqueue(11);
		ob.Enqueue(12);
		ob.Enqueue(13);
		ob.Enqueue(45);
		ob.Enqueue(47);
		
		//ob.display();
		//2
		ob.Dequeue();
		ob.display();
		//3
		ob.size();
		ob.Dequeue();
		ob.display();
	   //4
		ob.peek();
		
		
		
		
		
		
		
		
		

	}

}
