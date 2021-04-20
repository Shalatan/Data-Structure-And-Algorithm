//find leaders in an array
//leaders are those numbers which doesnt have bigger number than them on their right side

public class LeaderInArray {
    static void leaders(int arr[],int n){
        int curLeader = arr[n-1];
        System.out.print(curLeader+" ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>curLeader){
                curLeader=arr[i];
                System.out.print(curLeader+" ");
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {7,10,4,10,6,5,2};
        int n = arr.length;
        leaders(arr, n);
    }

}
