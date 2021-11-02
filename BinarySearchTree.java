class BinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node bstroot;

    public BinarySearchTree(){
        bstroot = null;
    }

    void insert(int data) {
        bstroot = insertRecursive(bstroot, data);
    }

    Node insertRecursive(Node root, int value){
        if (root == null){
            root = new Node(value);
            return root;
        }
        if (value < root.data)
            root.left = insertRecursive(root.left, value);
        else if (value > root.data)
            root.right = insertRecursive(root.right, value);
        return root;
    }

    int height(Node root){
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;   
    }

    void printDeepestNodes(Node root, int level) {
        if (root == null) return;

        if (level == 1)
            System.out.print(", " + root.data);
        else if (level > 1) {
            printDeepestNodes(root.left, level - 1);
            printDeepestNodes(root.right, level - 1);
        }
    }

    void insertIntArray(int[] array){
        for(int i = 0; i < array.length; i++){
            insert(array[i]);
        }

    }

    void inorder() {
        inorderRecursive(bstroot);
    }

    void inorderRecursive(Node root) {
        if (root != null) {
            inorderRecursive(root.left);
            System.out.print(root.data + " ");
            inorderRecursive(root.right);
        }
    }
}