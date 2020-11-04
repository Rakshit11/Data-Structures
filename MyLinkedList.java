package implementationOfDataStructures;
//********************************************************************************
//**   Create a class Node to implement the head of linked list and store data  **
//**             Then create methods to add and print data                      **
//**             This is a simple linked list demonstration                     **
//**                All methods can be created this way                         **
//********************************************************************************
class Node<E>{
	Node<E> next;
	E data;
	public Node(E data) {
		this.data=data;
		next = null;
	}
}
public class MyLinkedList<E>{
	Node<E> head;
	public void add(E data) {
		Node<E> toAdd = new Node<E>(data);
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next!=null) {
			temp = temp.next;			
		}
		temp.next= toAdd;
	}
	public void print() {
		Node<E> temp = head;
		while(temp!=null) {
			System.out.print("["+temp.data+"] ");
			temp= temp.next;
		}
	}
	boolean isEmpty() {
		return head== null;
	}
	public static void main(String[] args) {
		System.out.println("********************************************************************************\n"
				+ "**   Create a class Node to implement the head of linked list and store data  **\n"
				+ "**             Then create methods to add and print data                      **\n"
				+ "**             This is a simple linked list demonstration                     **\n"
				+ "**                All methods can be created this way                         **\n"
				+ "********************************************************************************");
		MyLinkedList<Integer> ll = new MyLinkedList<Integer>();
		ll.add(2);
		ll.add(3);
		ll.add(43);
		ll.print();
	}
}










































