package bai5;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new Node(60);
        bst.add(6);
        bst.add(4);
        bst.add(8);
        bst.add(3);
        bst.add(5);
        bst.add(7);
        bst.add(9);
        System.out.println(bst.containsValue(6));
        bst.delete(6);
        bst.traverseInOrder(bst.root);
    }
}
