//convert binary tree into Doubly Linked List in Inorder Traversal
//T.C. - O(n)
//S.C. - O(1)

class LNode {
    LNode left, right;
    int key;
    LNode(int d) {
        key = d;
        left = right = null;
    }
}

public class BinaryTreeToDLL {

    static LNode prev = null;                   //null only before first node is attached
    static LNode treeToDLL(LNode root) {
        if (root == null) {
            return null;
        }
        LNode head = treeToDLL(root.left);
        if (prev == null) {                     //check of prev is null, if yes it means it's first node, make it head
            head = root;
        } else {                                //if prev is !null, connect current node(root) with prev node
            root.left = prev;
            prev.right = root;
        }
        prev = root;                            //make the newly added node as new prev for next node
        treeToDLL(root.right);
        return head;
    }

    public static void main(String[] args) {

        LNode root = new LNode(10);
        root.left = new LNode(5);
        root.right = new LNode(20);
        root.right.left = new LNode(30);
        root.right.right = new LNode(35);

        LNode head = treeToDLL(root);
        printlist(head);

    }

    public static void printlist(LNode head) {
        LNode curr = head;
        while (curr != null) {
            System.out.print(curr.key + " ");
            curr = curr.right;
        }
    }
}