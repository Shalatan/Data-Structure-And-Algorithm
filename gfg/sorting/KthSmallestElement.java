public class KthSmallestElement {
    
    static int KthSmallest(int arr[],int n,int k){
        int l = 0;
        int r = n-1;
        while(l<=r){
            int p = partition(arr,l,r);
            if(p==(k-1)) return arr[p];
            else if(p>(k-1)) r=p-1;
            else l=p+1;
        }
        return -1;
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
        int arr[] = {10,2,5,8,11,6,26};
        int n = arr.length;
        int k = 5;
        System.out.println("Kth Smallest element in Array is");
        int a = KthSmallest(arr,n,k);
        System.out.println(a);
    }
}