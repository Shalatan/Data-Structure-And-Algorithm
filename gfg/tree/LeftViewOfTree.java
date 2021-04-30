public class LeftViewOfTree {
    
    static ArrayList<Integer> leftViewUsingLevelOrderTraversal(Node root){
        if(root==null) 
            return new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            int a = q.size();
            for(int i=0;i<a;i++){
                Node cur = q.poll();
                if(i==0)    
                    ans.add(cur.data);
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
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
        root.right.right.right=new Node(60);

        ArrayList<Integer> levelOrderAnswer = leftViewUsingLevelOrderTraversal(root);
        System.out.print(levelOrderAnswer);
}
