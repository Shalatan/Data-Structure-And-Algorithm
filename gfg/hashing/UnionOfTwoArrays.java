import java.util.*;
public class UnionOfTwoArrays {

    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<n;i++)
            hash.add(a[i]);
        for(int i=0;i<m;i++)
            hash.add(b[i]);
        System.out.println(hash);
        return hash.size();
    }

    public static void main(String[] args) {
        int arr[] = {4,14,24,44,13,55};
        int brr[] = {3,76,24,44};
        int n = arr.length;
        int m = brr.length;
        int ha = doUnion(arr,n,brr,m);
        System.out.print(ha);
    }
}
