//Inversion happens when a larger element comes before a smaller element in array
//It can be calculated inside merge function of merge sort
//During merging we will if check if element in left array is larger than the element in array and increase the count
//Time Complexity = O(n log n)
public class CountInversion {
    static int countInv(int arr[],int l,int r){
        int res = 0;
        if(l<r){
            int m = (l+r)/2;
            res += countInv(arr,l,m);
            res += countInv(arr,m+1,r);
            res += mergeAndCount(arr,l,m,r);
        }
        return res;
    }
    static long mergeAndCount(int arr[],int l,int m,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++)   left[i]=arr[l+i];
        for(int i=0;i<n2;i++)   right[i]=arr[m+1+i];
        int i=0,j=0,k=l;
        long res = 0;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
                res += n1-i;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        return res;
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int n = arr.length;
        System.out.println("Inversions in Array are");
        long a = countInv(arr, 0, n-1);
        System.out.println(a);
    }
}
