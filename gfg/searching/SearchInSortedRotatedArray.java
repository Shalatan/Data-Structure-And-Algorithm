//find an element in sorted but rotated array, can be rotated any number of times
//Time Complexity - O(log N)
//Tip - Find mid,then left or right half to the mid would be sorted, check if x lies between that sorted range, if not then x lies in unsorted range

public class SearchInSortedRotatedArray {

    static int search(int arr[],int n, int x){
        int low = 0;
        int high = n-1;
        System.out.println(n);
        if(n==2){
            if(arr[0]>arr[1]) return 1;
            else return 0;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x)
                return mid;
            // if(arr[mid]>arr[low]){   //check if left half is sorted aray
                if(arr[mid]>x && arr[low]<=x) //check if element exist in this sorted range
                    high=mid-1;      
                else
                    low=mid+1;
            // }
            // else{                   //means right half is sorted
	            if(arr[mid]<x&&arr[high]>=x)    //check if element exist in this sorted range
	                low=mid+1;
	            else
	                high=mid-1;
	        // }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {5,1,2,3,4};
        int n = arr.length;
        int find = 1;
        System.out.println("Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int index = search(arr, n, find);
        System.out.println("First Index = "+index);
    } 
}
