package implementationOfDataStructures;

import java.util.Scanner;

public class TreeTraversal {
	static Scanner sc = new Scanner(System.in);
	public static Node createTree() {
		System.out.println(" Enter data ");
		int data = sc.nextInt();
		if(data==-1) return null;
		Node root = new Node(data);
		System.out.println("Enter left of element " + root.data );
		root.left = createTree();
		System.out.println("Enter right of element " + root.data);
		root.right = createTree();
		return root;
	}
	static void inOrderTraversal(Node root) {
		if(root==null) return;
		inOrderTraversal(root.left);
		System.out.print(" " +  root.data + " " );
		inOrderTraversal(root.right);
	
	}
	static void preOrderTraversal(Node root) {
		if(root==null) return;
		System.out.print(" "+ root.data+ " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	
	}
	static void postOrderTraversal(Node root) {
		if(root==null) return;
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
		System.out.print(" " +root.data+ " ");
	
	}
	public static void main(String[] args) {
		System.out.println("********************************************************************************\n"
				+          "**   Create a class Node to implement the top or head of Tree and store data   **\n"
				+          "**      Then create method ''createTree'' to make a tree  and print data       **\n"
				+          "**       Now create inOrder, preOrder and postOrder Traversal methods          **\n"
				+          "**                All methods can be created this way                          **\n"
				+          "********************************************************************************");
		Node A = createTree();
		
		inOrderTraversal(A);
		System.out.println(" InOrder Traversal ");
		
		preOrderTraversal(A);
		System.out.println(" PreOrder Traversal ");
	
		postOrderTraversal(A);
		System.out.println(" PostOrder Traversal ");
		
		
	}
}
class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data=data;
		left = null;
		right =null;
	}
}