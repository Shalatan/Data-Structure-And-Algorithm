public class RotateArrayByD {
    static void rotateArr(int arr[], int d, int n) {
    int temp[] = new int[d];
    for(int i = 0; i  < d; i++)
        temp[i] = arr[i];
    for(int i = d; i  < n; i++)
        arr[i - d] = arr[i];
    for(int i = 0; i  < d; i++)
        arr[n - d + i] = temp[i];
    }

    public static void main(String[] args){
        int arr[] = {5,10,3,7,4,2};
        int n = 6;
        System.out.println("Before");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        rotateArr(arr, 2,n);
        System.out.println("After");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
