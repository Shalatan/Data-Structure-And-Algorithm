//find maximum sum of subarrays of the array

public class MaxSumSubArray {

    static int maxSum(int arr[]){
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i=1;i<n;i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
        return res;
    }

    public static void main(String[] args){
        int arr[] = {-3,8,-2,4,-5,7};
        int n = arr.length;
        System.out.println("Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int max = maxSum(arr);
        System.out.println("Max Sum = "+max);
    }
}
