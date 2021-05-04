//find difference between sum of nodes of even and odd levels
// 10
public class OddEvenDifference {
    
    static int getDiff(Node root){
        if(root==null) return 0;

        return root.key-getDiff(root.left)-getDiff(root.right);
    }

    public static void main(String[] args) {
        
        Node root=new Node(10);                 //level 1 - odd
    	root.left=new Node(20);                 //level 2 - even
    	root.right=new Node(30);    
    	root.right.left=new Node(40);           //level 3 - odd
    	root.right.right=new Node(50);
        root.right.right.right=new Node(60);    //level 4 - even

        int a = getDiff(root);
        System.out.println("Difference between even and odd levels of tree = "+a);
    }
}
