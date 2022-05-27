class Node {
    //Creating a binary tree
    char key;
    Node left, right;

    Node(char key) {
        this.key = key;
    }
}

class Traversal {
    Node root;
    //Pre order Traversal in a binary tree
    void perordertraversal(Node n) {
        if (n != null) {
            System.out.print(n.key + " ");
            perordertraversal(n.left);
            perordertraversal(n.right);
        }
    } 
    // Post order Traversal in a binary tree
    void postordertraversaL(Node n) {
        if (n != null) {
            perordertraversal(n.left);
            perordertraversal(n.right);
            System.out.print(n.key + " ");
        }
    }
    // In order Traversal in a binary tree
    void inordertraversal(Node n) {
        if (n != null) {
            perordertraversal(n.left);
            System.out.print(n.key + " ");
            perordertraversal(n.right);
        }
    }
}
public class tree_traversal {
    
    public static void main(String [] args) {
        Traversal t1 =new Traversal();
        t1.root = new Node('A');
        t1.root.left = new Node('B');
        t1.root.right = new Node('C');
        t1.root.left.left = new Node('D');
        t1.root.left.right = new Node('E');
        System.out.println("Pre Order Traversal");
        t1.perordertraversal(t1.root);
        System.out.println("\nPost Order Traversal");
        t1.postordertraversaL(t1.root);
        System.out.println("\nIn Order Traversal");
        t1.inordertraversal(t1.root);

    }
}
