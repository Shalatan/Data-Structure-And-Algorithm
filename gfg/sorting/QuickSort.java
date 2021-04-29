// Partition Types - Space Stable   Avg Case    Worst Case
// Naive Partition - O(n)   Yes    O(n log n)      O(n^2)
// Lomuto Partition- O(1)   No     O(n log n)      O(n^2)
// Hoare Partition - O(1)   No     O(n log n)      O(n^2)

public class QuickSort {

    static void quickSort(int arr[], int low, int high)
    {
        if(low<high){
        int p = partition(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
    }
    }
    
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;  
        return i+1;
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
        quickSort(arr, 0, n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

