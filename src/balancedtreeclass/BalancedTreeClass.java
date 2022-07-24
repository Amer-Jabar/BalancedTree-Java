package balancedtreeclass;

public class BalancedTreeClass {
    
    // Insertion is in linear time.
    
    public static void main(String[] args) {
        
        BalancedTree t = new BalancedTree();
        
        t.insert(t.root, 1);
        t.insert(t.root, -1);
        t.insert(t.root, 2);
        t.insert(t.root, 3);
        t.insert(t.root, 4);
        t.insert(t.root, -5);
        t.insert(t.root, -6);
        t.insert(t.root, -7);
        t.clearComplexity();
        t.insert(t.root, -2);
        t.printComplexity();
        
        
    }
    
}

class BalancedTree {
    
    Node root;
    int complexity;
    
    public BalancedTree() {
        root = new Node();
        complexity = 0;
    }
    
    public BalancedTree(Integer data) {
        root = new Node(data);
        complexity = 0;
    }
    
    public void insert(Node node, Integer data) {
        complexity++;
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
    
    public void printComplexity() {
        System.err.println("The complexity yet has been " + complexity);
    }
    
    public void clearComplexity() {
        complexity = 0;
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
