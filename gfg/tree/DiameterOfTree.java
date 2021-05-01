//find the diameter of tree i.e. distance between two farthest nodes
//T.C. - O(n)
//S.c. - O(height)
public class DiameterOfTree {
    
    static int res = 0;
    static int height(Node root){
        if(root==null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        res = Math.max(res,1+lh+rh);

        return 1+Math.max(lh,rh);
    }

    public static void main(String[] args) {
        
        Node root=new Node(10);
    	root.left=new Node(20);
        root.left.left= new Node(05);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(60);
	    root.right.left.left=new Node(50);
	    root.right.right.right=new Node(70);

        height(root);
        System.out.println("Diameter of Tree is = "+res);

    }

    //       -------10-------
    //  ----20        ------30--------
    // 05        ----40              60-----
    //          50                         70
}
