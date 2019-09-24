import java.util.*;

class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }

}

public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    public void add(int value){
        insertRecursive(root, value);
    }

    public Node insertRecursive(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value > root.value) {
            root.right = insertRecursive(root.right, value);
        } else if (value < root.value) {
            root.left = insertRecursive(root.left, value);
        } else {
            return root;
        }

        return root;

    }

    public boolean containsElement(int element){
        return containsElementRecursive(root, element);
    }

    public boolean containsElementRecursive(Node root, int element){

        if(root == null){
            return false;
        }

        if(element == root.value){
            return true;
        }

        return element < root.value
                ? containsElementRecursive(root.left, element)
                : containsElementRecursive(root.right, element);


    }

    public void delete(int value){
        deleteRecursive(root, value);
    }

    public Node deleteRecursive(Node root, int value){

        if(root == null){
            return null;
        }

        if(value == root.value){

            if(root.left == null && root.right == null){
                return null;
            }

            if(root.right == null){
                return root.left;
            }

            if(root.left == null){
                return root.right;
            }

            int smallestValue = findSmallestValue(root.right);
            root.value = smallestValue;
            root.right = deleteRecursive(root.right, smallestValue);
            return root;

        }

        if(value < root.value){
            root.left = deleteRecursive(root.left, value);
            return root;
        }

        root.right = deleteRecursive(root.right, value);
        return root;

    }

    public int findSmallestValue(Node root){
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        System.out.println(bt.containsElement(9));
        bt.delete(9);
        System.out.println(bt.containsElement(9));

    }

}





