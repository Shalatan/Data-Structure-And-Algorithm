//find subarray of 3 elements with sum X
//Time Complexicity - O(n^2)

import java.util.*;
public class TripletSum {

    public static boolean find3Numbers(int arr[], int n, int X) { 
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int l = i+1;
            int h = n-1;
            while(l<h){
                int s = arr[i]+arr[l]+arr[h];
                if(s==X) return true;
                else if(s>X) h--;
                else l++;
            }
        }
    return false;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,4,45,6,10,8};
        int n = arr.length;
        int f = 57;
        System.out.println("Found the tiplet - ");
        boolean a = find3Numbers(arr,n,f);
        System.out.println(a);
    }
}
