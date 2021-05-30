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

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root = new Node(1);
        bt.insert(root,3);
    }
}
