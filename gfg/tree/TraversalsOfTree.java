import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

class TraversalsOfTree{

    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
    	
        System.out.println("Inorder Traversal of Tree");
    	inOrder(root);
        System.out.println("\nPreOrder Traversal of Tree");
    	preOrder(root);
        System.out.println("\nPostOrder Traversal of Tree");
    	postOrder(root);
        System.out.println("\nLevelOrder Traversal of Tree");
    	levelOrder(root);
    } 
    
    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);    
        }
    }
    
    public static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key+" ");
        }
    }

    public static levelOrder(Node root){
        if(root==null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(queue.isEmpty()==false){
            Node cur = queue.poll();
            System.out.println(cur.key);
            if(cur.left!=null)
                queue.add(cur.left);
            if(cur.right!=null)
                queue.add(cur.right);
        }
    }
}