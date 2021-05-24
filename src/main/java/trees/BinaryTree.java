package trees;

public class BinaryTree {

    static class Node{
        int item;
        Node left,right;
        Node (int item){
            this.item=item;
        }
    }

    Node root;
    public BinaryTree(int item){
        root = new Node(item);
    }
    public BinaryTree(){
        root = null;
    }

    void insert(Node node,int item){

    }
}
