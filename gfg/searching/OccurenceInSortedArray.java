//find count of number in sorted array
//Time Complexity = O(Log N)
//Hint : Find First index in O(Log N),Find Last Index in O(Log N), find count = final-first+1

public class OccurenceInSortedArray {

    static int firstOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if(x > arr[mid])
				low = mid + 1;
			else if(x < arr[mid])
				high = mid - 1;
			else{
			    if(mid == 0 || arr[mid - 1] != arr[mid])
					return mid;
				else
					high = mid - 1;
                }
            }
		return -1;
	}

    static int lastOcc(int arr[], int n, int x)
	{
		int low = 0, high = n - 1;
		while(low <= high)
		{
			int mid = (low + high) / 2;
			if(x > arr[mid])
				low = mid + 1;
			else if(x < arr[mid])
				high = mid - 1;
			else{
				if(mid == n - 1 || arr[mid + 1] != arr[mid])
					return mid;
                else
					low = mid + 1;
                }
        }    
        return -1;
    }

    static int Count(int arr[],int n,int x){
        int first = firstOcc(arr, n, x);
        if(first==-1)
            return 0;                   //it means element was not found during first occournce
        else
            return lastOcc(arr, n, x)-first+1;
    }

        public static void main(String[] args){
            int arr[] = {1,1,2,2,2,3,4,5,5,5,5,6,7};
            int n = arr.length;
            int find = 5;
            System.out.println("Array");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
            int firstIndex = firstOcc(arr, n, find);
            int lastIndex = lastOcc(arr, n, find);
            int count = Count(arr, n, find);
            System.out.println("First Index of 5 = "+firstIndex);
            System.out.println("Last Index of 5 = "+lastIndex);
            System.out.println("Numbers of 5 = "+count);
        }    
    }
