
public class Main {

    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();

        int[] array = new int[] {12,11,90,82,7,9};

        bst.insertIntArray(array);

        int height = bst.height(bst.bstroot);
        System.out.print(height - 1);
        bst.printDeepestNodes(bst.bstroot,height);

    }
}