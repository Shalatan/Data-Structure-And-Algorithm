class RandomNode {
    int data;
    RandomNode next, arb;

    RandomNode(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}

public class CloningLinkedListRandomPointer {

    static RandomNode copyList(RandomNode head) {
        RandomNode cur = head;
        while(cur!=null){
            RandomNode temp = new RandomNode(cur.data);
            temp.next = cur.next;
            cur.next = temp;
            cur=cur.next.next;
        }
        cur=head;
        while(cur!=null){
            cur.next.arb=cur.arb!=null?cur.arb.next:null;
            cur=cur.next.next;
        }
        RandomNode original = head;
        RandomNode copy = head.next;
        RandomNode copyHead = copy;
        while(original!=null&&copy!=null){
            original.next=original.next!=null?original.next.next:original.next; 
            copy.next=copy.next!=null?copy.next.next:copy.next; 
            original=original.next; 
            copy=copy.next; 
        }
        return copyHead;
    }
    
    public static void printlist(RandomNode head){
        RandomNode curr=head;
        while(curr!=null){
            System.out.print("Data : "+curr.data);
            if(curr.arb!=null){
                System.out.print("\tRandom : "+curr.arb.data);
            }
            System.out.println("");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{ 
		RandomNode head = new RandomNode(10); 
        head.next = new RandomNode(5); 
        head.next.next = new RandomNode(20); 
        head.next.next.next = new RandomNode(15); 
        head.next.next.next.next = new RandomNode(20); 
        
        head.arb = head.next.next;
        head.next.arb=head.next.next.next;
        head.next.next.arb=head;
        head.next.next.next.arb=head.next.next;
        head.next.next.next.next.arb=head.next.next.next;
        
        RandomNode cloned_list = copyList(head); 
        System.out.println("Original");
        printlist(head);
        System.out.println("Copy");
        printlist(cloned_list);
	}
}
