package implementationOfDataStructures;
//********************************************************************************
//**   Create a class Node to implement the head of linked list and store data  **
//**             Then create methods to add and print data                      **
//**             Then create class to implement stack functions                 **
//**             This is a simple stack demonstration using Linked List         **
//**             This is a simple Stack demonstration                           **
//**                All methods can be created this way                         **
//********************************************************************************
class NODE<E>{
	NODE<E> next;
	E data;
	public NODE(E data) {
		this.data=data;
		next = null;
	}
}
class StackFunction<E>{
	private MyStack<E> stack = new MyStack<E>(); 
	void push(E e) {
		stack.add(e);
	}
	E pop() throws Exception {
		
		return stack.removeLast();
		
	}
	E peek() throws Exception {
		return stack.getLast();
	}
}
public class MyStack<E> {
	NODE<E> head;
	public void add(E data) {
		NODE<E> toAdd = new NODE<E>(data);
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		NODE<E> temp = head;
		while(temp.next!=null) {
			temp = temp.next;			
		}
		temp.next= toAdd;
	}
	public void print() {
		NODE<E> temp = head;
		while(temp!=null) {
			System.out.print("["+temp.data+"] ");
			temp= temp.next;
		}
	}
	boolean isEmpty() {
		return head== null;
	}
	public E removeLast() throws Exception {
		NODE<E> temp = head;
		if(temp==null) {
			throw new Exception(" Cannot remove empty element");
		}
		if(temp.next == null) {
			NODE<E> toRemove = head;
			head = null;
			return toRemove.data;
		}
		while(temp.next.next!= null) {
			temp = temp.next;
		}
		NODE<E> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
		
	}
	public E getLast () throws Exception {
		NODE <E> temp = head;
		if(temp==null) {
			throw new Exception(" Cannot peek from empty element ");
		}
		while(temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	

	public static void main(String[] args) throws Exception {
		System.out.println("********************************************************************************\n"
				+ "**   Create a class Node to implement the head of linked list and store data  **\n"
				+ "**             Then create methods to add and print data                      **\n"
				+ "**             Then create class to implement stack functions                 **\n"
				+ "**             This is a simple stack demonstration using Linked List         **\n"
				+ "**                All methods can be created this way                         **\n"
				+ "********************************************************************************");
		StackFunction<Integer> stack = new StackFunction<>();
		stack.push(2);
		stack.push(3);
		stack.push(4);
//		Checking top element is 4
		System.out.println(stack.peek());
//		Checking which element is popped and popped element is 4
		System.out.println(stack.pop());
//		Now again checking element at Top after 4 being popped and new top element is 3
		System.out.println(stack.peek());
	}
}
