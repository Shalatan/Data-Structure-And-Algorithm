public class MinimumPages {
    static int findMinPages(int arr[],int n,int k){
        int sum = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        System.out.println("SUM = "+sum);
        System.out.println("MAX = "+max);

        int res = 0;
        int low = max;
        int high = sum;
        while(low<=high){
            int mid = (low+high)/2;
            if(isFeasible(arr,n,k,mid)){
                res = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }

    static boolean isFeasible(int arr[],int n,int k,int ans){
        int stu = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>ans){
                sum = arr[i];
                stu++;
            }
            else
                sum += arr[i];
        }
        return (stu<=k);
    }

    public static void main(String[] args){
        int arr[] = {10,20,40,10,40};
        int n = arr.length;
        System.out.println("Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int index = findMinPages(arr, n, 2);
        System.out.println("Maximum Pages = "+index);
    }
}
