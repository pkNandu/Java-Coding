//Insert elements in a binary search tree

class Node{
    char key;
    Node left, right;
    Node(char key) {
        this.key = key;
    }
} 
class BinarySolution {
    Node root;
    void insertkey(char key) {
        root = insertInTree(root, key);
    }
    Node insertInTree(Node root, char key) {
        if(root == null) {
            root = new Node(key);
            return root;
        }
        if(key < root.key) {
            root.left = insertInTree(root.left, key);
        }
        else if(key > root.key) {
            root.right = insertInTree(root.right, key);
        }
        return root;
    }
    
    void perordertraversal(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            perordertraversal(root.left);
            perordertraversal(root.right);
        }
    }
}

public class binary_search_tree {
    public static void main(String[] args) {
        BinarySolution b1 = new BinarySolution();
        b1.insertkey('B');
        b1.insertkey('A');
        b1.insertkey('D');
        b1.insertkey('C');
        b1.insertkey('F');
        b1.insertkey('E');
        b1.perordertraversal(b1.root);

    }
}
