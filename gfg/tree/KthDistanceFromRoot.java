public class KthDistanceFromRoot {
    
     // Recursive function to print right view of a binary tree.
    static void Kdistance(Node root, int k)
     {
         if(root==null) return;
         if(k==0){
             System.out.print(root.key+" ");
         }
         else{
             Kdistance(root.left,k-1);
             Kdistance(root.right,k-1);
         }
     }

    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
        root.right.right.right=new Node(60);
    	
        System.out.println("Kth Distance from Root = ");
    	Kdistance(root,2);
    }
}
