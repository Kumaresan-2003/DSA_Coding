package Com.handson;
class Node01{
	int data;
	static  Node next;
	static Node front;
	static Node rear;
	Node01(int data){
		this.data=data;	
		front=null;
		rear=null;
		next=null;
	}
}
class  queuelist{
	//0
	public static Node create(int data) {
		return new Node(data);
	}
	//1
	private static Node front=null;
	private static Node rear=null;
	private Node next=null;
	
	public static void Enqueue(int data) {
	     Node newnode=create(data);
	     if(isEmpty()) {
	    	 front=newnode;
	    	 rear=newnode;
	     }
	     else {
	    	 rear.next=newnode;
	    	 rear=newnode;
	    	 rear.next=null;
	     }   
	}
	//2
	public static void Dequeue() {
		if(isEmpty()) {
			System.out.print("Cant deleted");
			return ;
		}
		else {
			front=front.next;
		}	
	}
    //3
	public static boolean isEmpty() {
		if(front==null && rear==null) {
			return true;
		}
		else {
			return false;
		}
	}
	//4
	public static void size() {
		Node temp=front;
		int ct=0;
		while(temp!=null) {
			ct++;
			temp=temp.next;
		}
		System.out.print(ct+" ");
	}
	//5
	public static void display() {
		Node temp=front;
		while(temp!=null) 
		{
           System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
public class QueueLinkedlist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queuelist ob=new queuelist();
		ob.Enqueue(10);
		ob.Enqueue(10);
		ob.Enqueue(10);
		ob.Enqueue(10);
		ob.display();
		
		ob.Dequeue();
		ob.display();
		ob.size();
		
		

	}
}
