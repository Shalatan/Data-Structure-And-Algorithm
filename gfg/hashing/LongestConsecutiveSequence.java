import java.util.*;
class LongestConsecutiveSequence{

    static int findLongestConseqSubseq(int arr[], int n)
	{
	    int res = 0;
	    HashSet<Integer> hash = new HashSet<>();
	    for(int i=0;i<n;i++)
	        hash.add(arr[i]);
	    for(int i=0;i<n;i++){
	        if(hash.contains(arr[i]-1)){
	            continue;
	        }
	        else{
	            int c = 1;
	            while(hash.contains(arr[i]+c)){
	                c++;
	            }
	            res = Math.max(res,c);
	        }
	    }
	    return res;
	}

    public static void main(String[] args) {
        int arr[] = {0,3,7,2,5,8,4,6,0,1};
        int n = arr.length;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        int a = findLongestConseqSubseq(arr, n);
        System.out.println("\nLongest Sequence - "+a);
    }
}