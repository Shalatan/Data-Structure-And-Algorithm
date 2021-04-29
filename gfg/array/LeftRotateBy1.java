//left rotate array by 1

public class LeftRotateBy1 {
    
    static void lRotate(int arr[],int n){
        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    
    public static void main(String[] args){
        int arr[] = {5,10,3,7,4,2};
        int n = 6;
        System.out.println("Before");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        lRotate(arr, n);
        System.out.println("After");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
