public class HeightOfTree {

    static int height(Node node) 
    {
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }

    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
        root.right.right.right=new Node(60);
    	
    	int a = height(root);
        System.out.println("Height of the tree = "+a);
    } 
}


