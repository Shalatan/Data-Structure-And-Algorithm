public class ReverseLinkedList {
    
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        
    }

}