package ds.trees;

public class DeleteBSTTreeNode {
    Node root;

    public DeleteBSTTreeNode(){
        root = null;
    }
    public DeleteBSTTreeNode(int value){
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
  private void delete(int key){
        deleteNode(this.root,key);

  }
    private void deleteNode(Node root,int key){
        if(root == null){
            return;
        }
        if(root.value == key){
            //Case 1 leaves node does not have any child
            if(root.left == null && root.right == null){
                root = null;
                return;
            }else if(root.left != null && root.right == null){ //case 2
                root = root.left;
            }else if(root.left == null && root.right != null){
                root = root.right;
            }else {
                Node min =  findMinNode(root); //case 3 find min right node
                min.left = root.left;
                if(root.right.value !=  min.right.value){
                    min.right = root.right;
                }

            }

        }else{
            if(root.value > key){
                deleteNode(root.left,key);

            }else {
                deleteNode(root.right,key);

            }

        }

    }

    private Node findMinNode(Node node){

        Node node1 = node.right;
        Node minNode=  node1;
        while(node1 != null){
            if(node1.value < minNode.value){
                minNode = node1;
            }
            node1 = node1.left;
        }
        return minNode;
    }

    // This method mainly calls deleteRec()
    void deleteKey(int key) { root = deleteRec(root, key); }

    /* A recursive function to
      delete an existing key in BST
     */
    Node deleteRec(Node root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;

        /* Otherwise, recur down the tree */
        if (key < root.value)
            root.left = deleteRec(root.left, key);
        else if (key > root.value)
            root.right = deleteRec(root.right, key);

            // if key is same as root's
            // key, then This is the
            // node to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.value = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    int minValue(Node root)
    {
        int minv = root.value;
        while (root.left != null)
        {
            minv = root.left.value;
            root = root.left;
        }
        return minv;
    }
    public static void main(String[] args) {
        DeleteBSTTreeNode bst = new DeleteBSTTreeNode();
        bst.insert(12);
        bst.insert(34);
        bst.insert(13);
        bst.insert(65);
        bst.insert(0);
        bst.insert(20);
        bst.insert(90);


       // System.out.println(bst.search(0));
        //System.out.println(bst.search(23));
        bst.print();
        System.out.println("After deletion of 34");
        bst.deleteKey(34);
        bst.print();


    }


}
