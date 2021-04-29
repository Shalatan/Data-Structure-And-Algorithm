//count number of 0 in 0s and 1s array where all the 1s are on left and all the 0s on right
//{1,1,1,1,1,,1,1,0,0,0,0,0,0}
//Time Complexity = O(logN)
//Space = O(1)

public class Count0InSortedArray {

    static int countZeroes(int[] arr, int n) {
        int i = 0;
        for(i=0;i<n;i++){
            if(arr[i]==0) break;
        }
        return n-i;
    }

    public static void main(String[] args){
        int arr[] = {1,1,1,1,1,1,1,1,0,0,0,0,0,0};
        int n = arr.length;
        System.out.println("Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int m = countZeroes(arr, n);
        System.out.println("Number of '0' element in Array= "+m);
    }
}
