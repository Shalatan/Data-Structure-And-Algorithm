//move 0s to the end from array without changing the order of sequence in O(n) time and using only O(1) auxiliary space

public class MoveZeroToEnd {
    
    static int move(int arr[],int n){
        int res = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[res]=arr[i];
                if(res!=i){
                    arr[i]=0;
                }
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[] = {5,10,0,0,0,0,6,0,8,0,0,9};
        int n = 12;
        System.out.println("Before");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int m = move(arr, n);
        System.out.println("Modified Array has total element = "+m);
        System.out.println("After");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

