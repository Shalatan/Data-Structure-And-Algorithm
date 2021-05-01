import java.util.*;
public class MaxWidthOfTree {
    
    int getMaxWidth(Node root)
    {
        if(root==null) return 0;
        Queue<Node> q = new LinkedList<>();
        int ans = 0;
        q.add(root);
        while(q.isEmpty()==false){
            int a = q.size();
            ans = Math.max(a,ans);
            for(int i=0;i<a;i++){
                Node cur = q.poll();
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
            }
        }
        return ans;
    }

    public static void main(String args[]) 
    { 
        Node root=new Node(10);                 //level 0
    	root.left=new Node(20);                 //level 1
    	root.right=new Node(30);
        root.left.left=new Node(40);            //level 2
    	root.right.left=new Node(40);
    	root.right.right=new Node(50);
        root.right.right.right=new Node(60);    //level 3
    	
    	int a = getMaxWidth(root);
        System.out.println("Max Width of Tree is - "+a);
    }
}
