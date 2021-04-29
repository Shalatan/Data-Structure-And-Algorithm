//find median of two different but sorted array
//Time Complexity = O(Log N)

public class MedianOfTwoSortedArray {

    static int findMedian(int arr[],int brr[]){
        int n = arr.length;
        int m = brr.length;
        int low1 = 0;
        int high1 = n;
        while(low1<high1){
            int i1 = (low1+high1)/2;
            int i2 = ((n+m+1)/2)-i1;
            int min1 = (i1==n)?Integer.MAX_VALUE:arr[i1];
            int max1 = (i1==0)?Integer.MIN_VALUE:arr[i1-1];
            int min2 = (i2==n)?Integer.MAX_VALUE:brr[i2];
            int max2 = (i2==0)?Integer.MIN_VALUE:brr[i2-1];
            if(min1>=max2&&min2>=max1){
                if((n+m)%2==0)
                    return (Math.max(max1,max2)+Math.min(min1, min2))/2;
                else
                    return Math.max(max1, max2);
            }
            else if(max1>min2)
                high1=i1-1;
            else 
                low1=i1+1;
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int brr[] = {3,4,5,6,7,8};
        System.out.println("Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println("");
        int median = 0;
        if(brr.length>=arr.length)              //first array should be smaller than second one for algorithm to run
            median = findMedian(arr,brr);       
        else
            median = findMedian(brr,arr);
        System.out.println("Median Element = "+median);
    }
}
