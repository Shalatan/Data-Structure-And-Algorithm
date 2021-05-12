//serialize and deserialze a binary tree i.e. 
//serialize - convert a Binary Tree into ArrayList/Array
//de-serialize - convert a ArrayList/Array into Binary Tree


import java.util.*;

public class SerializeDeserialize {
    
    static int index = 0;
    static public void serialize(Node root, ArrayList<Integer> A) 
	{
	    if(root==null){
	        return;
	    }
	    serialize(root.right,A);
	    A.add(root.key);
	    serialize(root.left,A);
	}
	
	//Function to deserialize a list and construct the tree.
    static public Node deSerialize(ArrayList<Integer> A)
    {
        if(index==A.size()) return null;
        int val = A.get(index);
        index++;

        Node root = new Node(val);
        root.left = deSerialize(A);
        root.right = deSerialize(A);
        return root;
    }

}
