import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class IterativeTraversalOfTree {
    
    static void iterativeInorder(Node root){
        if(root==null){
            return;
        }
        Stack<Node> s = new Stack<>();
        Node cur = root;
        while(cur!=null||s.isEmpty()==false){
            while(cur!=null){
                s.add(cur);
                cur=cur.left;
            }
            cur = s.pop();
            System.out.print(cur.key+" ");
            cur=cur.right;
        }
    }

    static void iterativePreorder(Node root){
        if(root==null) return;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(s.isEmpty()==false){
            Node cur = s.pop();
            System.out.print(cur.key+" ");
            if(cur.right!=null) s.push(cur.right);
            if(cur.left!=null) s.push(cur.left);
        }
    }

    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.left.left=new Node(40);
    	root.left.right=new Node(50);

        // |-------10-------|
        // 20          |---30---|
        //             40       50
    	
        System.out.println("Inorder Traversal of Tree");
    	iterativeInorder(root);
        System.out.println("\nPreOrder Traversal of Tree");
    	iterativePreorder(root);
        // System.out.println("\nPostOrder Traversal of Tree");
    	// postOrder(root);
        // System.out.println("\nLevelOrder Traversal of Tree");
    	// levelOrder(root);
    }
}
