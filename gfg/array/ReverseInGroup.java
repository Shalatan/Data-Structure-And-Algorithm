import java.util.*;

public class ReverseInGroup {
    static void reverseGroups(ArrayList<Integer> arr, int n, int k) {
        int m = n%k;
        int i = 0;
        for(i=0;i<n-m;i=i+k){
            reverse(arr.subList(i,i+k));
        }
        reverse(arr.subList(i,n));
    }
    
    static void reverse(List<Integer> arr)
    {
        Collections.reverse(arr);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,5,6,9,4,6,3,4));
        int n = arr.size();
        int  k = 3; //element in one group
        System.out.println("Before");
        System.out.println(arr);
        reverseGroups(arr, n, k);
        System.out.println("After");
        System.out.println(arr);
    }
}
