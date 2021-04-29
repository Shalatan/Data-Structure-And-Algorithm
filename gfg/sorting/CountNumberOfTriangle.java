//count number of triangles possible using array elements i.e. a+b>c 
import java.util.*;

public class CountNumberOfTriangle {
    static int findNumberOfTriangles(int arr[], int n)
    {
        int count = 0;
        Arrays.sort(arr);
        for(int i=n-1;i>=2;i--){
            int j = 0;
            int k = i-1;
            while(j<k){
                if(arr[j]+arr[k]>arr[i]){
                    count += (k-j);
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {6, 4, 9, 7, 8};
        int n = arr.length;
        System.out.println("Number of triangles possible in Array are");
        int a = findNumberOfTriangles(arr, n);
        System.out.println(a);
    }
    
}
