public class ChildSumParent {
    
    public static int isSumProperty(Node root)
    {
        if(root==null||(root.right==null&&root.left==null)) return 1;   //return true if reached leaf nodes
        int ls = root.left!=null?root.left.key:0;
        int rs = root.right!=null?root.right.key:0;
        if(root.key!=(ls+rs))  return 0;                                //return false if sum doesn't matches
        // System.out.println(root.data+"="+ls+"+"+rs);
        return isSumProperty(root.left)*isSumProperty(root.right);      //recurse for each node
    }


    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
        root.right.right.right=new Node(60);
    	
    	int a = isSumProperty(root);
        if(a==1)
            System.out.println("True");
        else
            System.out.println("False");
    } 
}
