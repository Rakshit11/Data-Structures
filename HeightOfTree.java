package implementationOfDataStructures;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data=data;
	}
}
public class HeightOfTree {
	public static Node createTree() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data : ");
		int data = sc.nextInt();
		if(data==-1) return null;
		Node root = new Node(data);
		System.out.println("Enter for left of node " + root.data);
		root.left = createTree();
		System.out.println("Enter for right of node " + root.data);
		root.right=createTree();
		return root;
	}
	public static int heightOfTree(Node root ) {
		if(root == null) return 0;
		Queue<Node> q = new ArrayDeque<>();
		q.add(root);
		Node front = null;
		int height = 0;
		while(!q.isEmpty()) {
			int size = q.size();
			while(size-->0) {
				front= q.poll();
				if(front.left!=null) {
					q.add(front.left);
				}
				if(front.right!=null) {
					q.add(front.right);
				}
			}
			height++;
		}
		return height;
	}


	public static void main (String[] args) {
		Node A=createTree();
		System.out.println("Height of the tree = "+ heightOfTree(A));
	}

}
