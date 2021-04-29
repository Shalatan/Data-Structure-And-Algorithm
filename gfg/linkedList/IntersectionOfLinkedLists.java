public class IntersectionOfLinkedLists{

    static int intersectPoint(Node head1, Node head2)
	{
	    int c1 = 1;
	    int c2 = 1;
	    Node cur = head1;
	    while(cur!=null){       //find length of list 1
	        cur=cur.next;
	        c1++;
	    }
	    cur = head2;
	    while(cur!=null){       //find length of list 2
	        cur=cur.next;
	        c2++;
	    }
	    Node cur2 = null;       
	    if(c1>c2){              //find longer list to iterate 'c1-c2' time
	        cur=head1;
	        cur2=head2;
	    }   
	    else{
	        cur=head2;
	        cur2=head1;
	    }
	    int d = Math.abs(c1-c2); //iterate longer list
	    for(int i=0;i<d;i++){
	        cur=cur.next;
	    }

	    while(cur!=null&&cur2!=null){
	        if(cur==cur2){       //find when they reach same node
	            return cur.data;
	        }
	        cur=cur.next;
	        cur2=cur2.next;
	    }
	    return -1;
	}
}