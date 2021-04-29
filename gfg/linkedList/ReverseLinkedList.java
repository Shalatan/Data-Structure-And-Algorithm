class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class ReverseLinkedList {

    static Node reverse(Node head){
        Node cur = head;
        Node prev = null;
        while(cur!=null){
            Node next = cur.next;
            cur.next = prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }

    public static void main(String args[]) 
    { 
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	printlist(head);
    	head=reverse(head);
    	printlist(head);
    }

    public static void printlist(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
