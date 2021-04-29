//find peak elements in sorted/unsorted array
//peak element - elements which are bigger than it's neighbour elements
//Time Complexicity = O(Log N)

public class PeakElement {
    static int findPeak(int[] arr,int n)
    {
       int low = 0, high = n - 1;
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if((mid == 0 || arr[mid - 1] <= arr[mid]) &&        //check if mid is first/last element and
				(mid == n - 1 || arr[mid + 1] <= arr[mid]))     //bigger than it's next/previous element
				return mid;
			if(mid > 0 && arr[mid - 1] >= arr[mid])     //if previous element is bigger, peak element will be in left half
				high = mid -1;
			else                                        //if next element is bigger, peak element will be in right half
				low = mid + 1;
		}
		return -1;
    }

    public static void main(String[] args){
        int arr[] = {5, 20, 40, 30, 20, 50, 60};
        int n = arr.length;
        System.out.println("Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int index = findPeak(arr, n);
        System.out.println("Peak Element at = "+index);
    }

}
