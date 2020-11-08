package implementationOfDataStructures;

import java.util.Scanner;

public class MyTree{
	static Scanner sc = new Scanner(System.in);
	public static Node createTree(){
		System.out.println(" Enter data ");
		int data= sc.nextInt();
		if(data == -1) {
			return null;
		}
		Node root = new Node(data);
		System.out.println("Enter left of element " + root.data);
		root.left= createTree();
		System.out.println("Enter right of element " + root.data);
		root.right=createTree();
		return root;
	}
	public static void main(String[] args) {
		System.out.println("********************************************************************************\n"
				+          "**   Create a class Node to implement the top or head of Tree and store data   **\n"
				+          "**      Then create method ''createTree'' to make a tree  and print data       **\n"
				+          "**             This is a simple linked list demonstration                      **\n"
				+          "**                All methods can be created this way                          **\n"
				+          "********************************************************************************");
		Node A = createTree();
		
	}
}
class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data= data;
		left=null;
		right=null;
	}
}