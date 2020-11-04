package implementationOfDataStructures;

class node<A>{
	node<A> next;
	A data;
	public node(A data) {
		this.data=data;
		next=null;
	}
}
public class MyQueue<E> {
	node<E> head, rear;
	public void Enqueue(E e) {
		node<E> toAdd=new node<>(e);
		if(head==null) {
			head = rear = toAdd;
			return;
		}	
		rear.next=toAdd;
		rear = rear.next;
		
	}
	public E Dequeue() {
		if(head==null) {
			return null;
		}
		node<E> temp = head;
		head = head.next;
		if(head== null) {
			rear=null;
		}
		return temp.data;
	}
	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<Integer>();
		System.out.println("********************************************************************************\n"
				+ "**   Create a class Node to implement the head of Queue and store data  **\n"
				+ "**             Then create methods to add and print data                      **\n"
				+ "**             This is a simple Queue demonstration                           **\n"
				+ "**                All methods can be created this way                         **\n"
				+ "********************************************************************************");
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
//		Null will be given with next dequeue operation as queue goes empty
		System.out.println(q.Dequeue());
	
		
	}

}
