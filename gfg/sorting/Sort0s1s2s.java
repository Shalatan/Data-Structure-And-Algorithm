//Dutch National Flag algortihm

public class Sort0s1s2s {
    
    static void sortArray(int arr[],int n){
        int low = 0;    //iterator for 0s
        int mid = 0;    //iterator for 1s
        int high = n-1; //iterator for 2s
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,2,0,0,1,1,0,2,1,0,1,1,0,2,0,1};
        int n = arr.length;
        System.out.println("UnSorted Array");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nSorted Array");
        sortArray(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
