import java.util.*;
public class UnionOfTwoSortedArray {
        
    static ArrayList<Integer> unionOfTwoSortedArray(int arr[], int brr[], int n, int m) 
    {
        ArrayList<Integer> a = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n&&j<m){
            if(i>0&&arr[i]==arr[i-1]){
                i++;
                continue;
            }
            if(j>0&&brr[j]==brr[j-1]){
                j++;
                continue;
            }
            if(arr[i]<brr[j]){
                a.add(arr[i]);
                i++;
            }  
            else if(arr[i]>brr[j]){
                a.add(brr[j]);
                j++;
            }  
            else if(arr[i]==brr[j]){
                a.add(arr[i]);
                i++;
                j++;
            }
        }
        while(i<n){
            if(i>0&&arr[i]!=arr[i-1]){
                a.add(arr[i]);
                i++;
            }
        }
        while(j<m){
            if(j>0&&brr[j]!=brr[j-1]){
                a.add(brr[j]);
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
        System.out.println("Union Of Twp Arrays");
        ArrayList<Integer> a = unionOfTwoSortedArray(arr, brr, n, m);
        System.out.println(a);
    }
}

