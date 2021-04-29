public class LeftRotateByD {
      
    //arr - array
    //n - size of array
    //d - number of rotations to be done
    static void lRotateD(int arr[],int n, int d){
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);
    }

    static void reverseArray(int arr[],int low,int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args){
        int arr[] = {5,10,3,7,4,2};
        int n = 6;
        System.out.println("Before");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        lRotateD(arr, n,2);
        System.out.println("After");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

