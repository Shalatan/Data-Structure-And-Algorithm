public class FloydCycleDetection {

    //detect loop
    public static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    //length of loop    T.C.- O(m)+O(n) where n - nodes inside loop, m - nodes outside loop
    static int countNodesinLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(fast==null||fast.next==null) return 0;
        int c = 0;
        slow=slow.next;
        while(slow!=fast){
            slow=slow.next;
            c++;
        }
        return c+1;
    }

    public static void main(String args[]) 
    { 
        Node head=new Node(15);
    	head.next=new Node(10);
    	head.next.next=new Node(12);
    	head.next.next.next=new Node(20);
    	head.next.next.next.next=new Node(55);
    	head.next.next.next.next.next=head.next;    
    	if (detectLoop(head)) 
            System.out.print("Loop found"); 
        else
            System.out.print("No Loop"); 
        System.out.println("\nLength of loop - "+countNodesinLoop(head));
    }

    //15-10-12-20-55
    //    |-------|
}
