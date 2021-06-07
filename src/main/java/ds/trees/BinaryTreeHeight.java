package ds.trees;

// Recursive Java program for level
// order traversal of Binary Tree

    class BinaryTreeHeight
    {
        // Root of the Binary Tree
        Node root;

        public BinaryTreeHeight()
        {
            root = null;
        }

        /* function to print level order traversal of tree*/
        void printLevelOrder()
        {
            int h = height(root);
            int i;
            for (i=1; i<=h; i++)
                printCurrentLevel(root, i);
        }

        /* Compute the "height" of a tree -- the number of
        nodes along the longest path from the root node
        down to the farthest leaf node.*/
        int height(Node root)
        {
            if (root == null)
                return 0;
            else
            {
                /* compute  height of each subtree */
                int lheight = height(root.left);
                int rheight = height(root.right);

                /* use the larger one */
                if (lheight > rheight)
                    return(lheight+1);
                else return(rheight+1);
            }
        }

        /* Print nodes at the current level */
        void printCurrentLevel (Node root ,int level)
        {
            if (root == null)
                return;
            if (level == 1)
                System.out.print(root.value + " ");
            else if (level > 1)
            {
                printCurrentLevel(root.left, level-1);
                printCurrentLevel(root.right, level-1);
            }
        }

        /* Driver program to test above functions */
        public static void main(String args[])
        {
            BinaryTreeHeight tree = new BinaryTreeHeight();
            tree.root= new Node(1);
            tree.root.left= new Node(2);
            tree.root.right= new Node(3);
            tree.root.left.left= new Node(4);
            tree.root.left.right= new Node(5);

            System.out.println("Level order traversal of");
                    tree.printLevelOrder();
        }
}
