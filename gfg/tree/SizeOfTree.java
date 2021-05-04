//find size of tree i.e. number of nodes in tree

public class SizeOfTree {
    
    static int treeSize(Node root){
        if(root==null)
            return 0;
        
        return treeSize(root.left)+treeSize(root.right)+1;
    }

    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
        // root.right.right.right=new Node(60);
    	
    	int a = treeSize(root);
        System.out.println("Size of the tree = "+a);
    } 
}
