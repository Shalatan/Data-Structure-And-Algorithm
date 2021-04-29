//find a pair in sorted array which gives sum equal to X
//Time Complexity = O(Log N)
//Tip - Two Pointer Approach

public class FindPairOfGivenSum {
    static boolean isPair(int arr[],int n,int x){
        int low = 0;
        int high = n-1;
        while(low<high){
            if(arr[low]+arr[high]==x)
                return true;
            else if(arr[low]+arr[high]>x)      //if sum is greater than x, means we want smaller number
                high--;
            else                               //if sum is lesser than x, means we want bigger number
                low++;
        }
        return false;
    }
    
    public static void main(String[] args){
        int arr[] = {2,4,8,9,11,12,20,30};
        int n = arr.length;
        System.out.println("Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        boolean pair = isPair(arr, n, 23);
        System.out.println("Found Pair = "+pair);
    }
}
