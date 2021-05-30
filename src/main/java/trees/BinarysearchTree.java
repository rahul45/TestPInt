package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarysearchTree {

	Node root;
	public BinarysearchTree(){
		root = null;
	}
	public BinarysearchTree(int value){
		root = new Node(value);
	}

	void insert(int value){
		root = insertValue(root,value);
	}
	//inorder value insertion
	Node  insertValue(Node node,int value){
		if(node == null){
			node = new Node(value);
			return node;
		}
		if(node.value<value){
			node.right=insertValue(node.right,value);
		}else if(node.value>=value){
			node.left=insertValue(node.left,value);
		}
		return node;

	}

 void print(){
		printInorder(root);
 }
	void printInorder(Node node){
		if(node != null){
			printInorder(node.left);
			System.out.println(node.value);
			printInorder(node.right);
		}
	}

	boolean search(int key){
		return searchKey(this.root,key);
	}
	boolean searchKey(Node root, int key){
		if(root == null){
			return false;
		}
		if(root.value == key){
			return true;
		}
		if(key > root.value){
			return searchKey(root.right,key);
		}else if(key < root.value){
			return searchKey(root.left,key);
		}
		return false;
	}

	public static void main(String[] args) {
		BinarysearchTree bst = new BinarysearchTree();

		bst.insert(12);
		bst.insert(34);
		bst.insert(13);
		bst.insert(65);
		bst.insert(0);
		bst.insert(20);
		bst.insert(90);

		//bst.print();

		System.out.println(bst.search(0));
		System.out.println(bst.search(23));
	}


}

