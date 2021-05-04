import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int d){
        data=d;
        left=null;
        right=null;
    }
}

class ListNode {
    int data;
    ListNode next;
    ListNode(int d) {
        data = d;
        next = null;
    }
}

public class BinaryTreeFromLinkedList {
    
    public static TreeNode root;
    public static TreeNode convert(ListNode head){

        if(head==null){                                         //if linked list is null, return null root
            root = null;
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        root = new TreeNode(head.data);                         //assign head of linkedList as root of tree
        queue.add(root);

        ListNode cur = head.next;
        while(cur!=null){
            
            TreeNode parentNode = queue.peek();
            queue.poll();
            
            TreeNode leftChild = new TreeNode(cur.data);
            parentNode.left = leftChild;
            queue.add(leftChild);
            
            TreeNode rightChild = null;
            if(cur.next!=null){
                cur=cur.next;
                rightChild = new TreeNode(cur.data);
                queue.add(rightChild);
            }
            parentNode.right = rightChild;
            cur = cur.next;
        }
        return root;
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(10);
        head.next = new ListNode(15);
        head.next.next = new ListNode(25);
        head.next.next.next = new ListNode(30);
        head.next.next.next.next = new ListNode(40);
        head.next.next.next.next.next = new ListNode(50);

        TreeNode root = convert(head);
        System.out.println("Level Order Traversal or Tree - ");
        printLevelOrder(root);
    }

    static void printLevelOrder(TreeNode root){
        if(root==null){
            System.out.println("NULL");
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.isEmpty()==false){
            TreeNode cur = queue.poll();
            System.out.print(cur.data+" ");
            if(cur.left!=null)
                queue.add(cur.left);
            if(cur.right!=null)
                queue.add(cur.right);
        }
    }
}
