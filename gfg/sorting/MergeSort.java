/*  1 Divide and Conqueror Algorithm
    2 Stable
    3 O(n log n) Time and O(n) Auxilary Space
    4 Well suited for linked list, works in O(1) Auxilary Space */

public class MergeSort {

    static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int m = (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            mergeArrays(arr,l,m,r);
        }
        
    }
    static void mergeArrays(int arr[],int l,int m,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++)   left[i]=arr[l+i];
        for(int i=0;i<n2;i++)   right[i]=arr[m+1+i];
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }

    
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int n = arr.length;
        System.out.println("Original Array");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAfter Merge Sort");
        mergeSort(arr, 0, n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
