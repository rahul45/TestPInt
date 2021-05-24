package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarysearchTree {
	Node root;
	public BinarysearchTree(int value) {
		root = new Node(value);

	}
	public BinarysearchTree() {
		root = null;
	}

	static class Node{
		int value;
		Node left,right;
		Node(int value){
			this.value=value;
		}
		
	}

	void insertElement(Node node,int val){
		Queue<Node> q = new LinkedList<Node>();
		while (!q.isEmpty()){
			if(node.value >val){
				if(node.right == null){
					node.right = new Node(val);
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("HI Rahul ");
		BinarysearchTree bst = new BinarysearchTree();
		Node a = new Node(2);
		bst.insertElement(a,12);
	
	}
}
