//find maximum number of consecutive 1's present in array with 0s and 1s

public class MaxConsecutive1 {

    static int countConsecutive1(int arr[]){
        int n = arr.length;
        int max = 0;
        int cur = 0;
        int i = 0;
        for(i=0;i<n;i++){
            if(arr[i]==0){
                cur=0;
            }
            else{
               cur++;
               if(cur>max){
                   max=cur;}
            }
        }
        return max;
    }

    public static void main(String[] args){
        // int tc1[] = {0,1,0,1,1,1,0,0,1,1};
        // int tc2[] = {1,1,1,1};
        // int tc3[] = {0,0,0,0,0};
        int tc4[] = {0,0,0,1,1,1,0,1,0,1,1,1,1,1};
        int max = countConsecutive1(tc4);
        System.out.println("Most Consecutive 1 = "+max);
    }
}
