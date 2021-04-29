import java.util.*;
public class IntersectionOfTwoSortedArray {
    
    static ArrayList<Integer> printIntersection(int arr[], int brr[], int n, int m) 
    {
        ArrayList<Integer> a = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(i>0&&arr[i]==arr[i-1]){
                i++;
                continue;
            }
            if(arr[i]<brr[j])   i++;
            else if(arr[i]>brr[j])   j++;
            else if(arr[i]==brr[j]){
                a.add(arr[i]);
                i++;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4};
        int brr[] = {2, 2, 4, 6, 7, 8};
        int n = arr.length;
        int m = brr.length;
        System.out.println("Intersection Elements Are");
        ArrayList<Integer> a = printIntersection(arr, brr, n, m);
        System.out.println(a);
    }
}
