public class WaveArray {
    
    // arr: input array
    // n: size of the array
    //Function to sort the array into a wave-like array.
    public static void convertToWave(int arr[], int n){
        for(int i =0 ; i<n-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] = {2,4,7,8,9,10};
        int n = arr.length;
        System.out.println("Before");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        convertToWave(arr, n);
        System.out.println("After");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
