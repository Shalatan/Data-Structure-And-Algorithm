import java.util.*;

public class MergeWithoutExtraSpace {
    
    public static void merge(int arr[], int brr[], int n, int m) 
    {
        int i=0;
        int j=0;
        int k=n-1;
        while(i<=k&&j<m){
            if(arr[i]<brr[j]){
                i++;
            }
            else{
                int temp=brr[j];
                brr[j]=arr[k];
                arr[k]=temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7};
        int brr[] = {0,2,4,6,8};
        int n = arr.length;
        int m = brr.length;
        System.out.println("Original Array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(brr[i]+" ");
        }
        System.out.println("\nAfter Merge Sort");
        merge(arr,brr,n,m);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<m;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
}
