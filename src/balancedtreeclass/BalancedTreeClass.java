package balancedtreeclass;

public class BalancedTreeClass {
    
    public static void main(String[] args) {
        
        BalancedTree t = new BalancedTree();
        
        t.insert(t.root, 1);
        t.insert(t.root, -1);
        t.insert(t.root, 2);
        t.insert(t.root, 3);
        t.insert(t.root, 4);
        t.insert(t.root, -5);
        t.insert(t.root, 0);
        t.print(t.root);
        
    }
    
}

class BalancedTree {
    
    Node root;
    
    public BalancedTree() {
        root = new Node();
    }
    
    public BalancedTree(Integer data) {
        root = new Node(data);
    }
    
    public void insert(Node node, Integer data) {
        if ( node.data == null ) {
            node.data = data;
            return;
        }
        
        if ( data <= node.data ) {
            if ( node.left != null )
                insert(node.left, data);
            else
                node.left = new Node(data);
        } else {
            if ( node.right != null )
                insert(node.right, data);
            else
                node.right = new Node(data);
        }
    }
    
    public void print(Node node) {
        System.out.println(node.data);
        if ( node.left != null )
            print(node.left);
        if ( node.right != null )
            print(node.right);
    }
}

class Node {
    Integer data;
    Node left;
    Node right;
    public Node() {}
    public Node(Integer data) {
        this.data = data;
    }
}
