public class IdenticalTreeOrNot {
    
    static boolean isIdentical(Node r1, Node r2)
	{
	    if(r1==null&&r2==null)  return true;
	    if(r1==null||r2==null)  return false;
	    if(r1.key!=r2.key) return false;
	    return isIdentical(r1.left,r2.left)&&isIdentical(r1.right,r2.right);
	}

    public static void main(String args[]) 
    { 
        Node root1=new Node(10);
    	root1.left=new Node(20);
    	root1.right=new Node(30);
    	root1.right.left=new Node(40);
    	root1.right.right=new Node(50);

        Node root2=new Node(10);
    	root2.left=new Node(20);
    	root2.right=new Node(30);
    	root2.right.left=new Node(40);
    	root2.right.right=new Node(50);
    	
    	boolean ans = isIdentical(root1,root2);
        System.out.println("Trees are Identical = "+ans);
    }
}
