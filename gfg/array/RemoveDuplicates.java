//remove duplicates from sorted array in O(n) time and using only O(1) auxiliary space

public class RemoveDuplicates {
    
    //arr - array
    //n - size of array
    static int remove(int arr[],int n){
        int res = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int arr[] = {10,20,20,30,30,30};
        int n = 6;
        System.out.println("Before");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int m = remove(arr, n);
        System.out.println("After");
        for(int i=0;i<m;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
