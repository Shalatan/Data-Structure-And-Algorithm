import java.util.ArrayList;

public class StockBuySellDays {

    static void stockBuySell(int arr[]) {
        // code here
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int minDrop = 0;
        int step = 0;
        for(int i=1;i<n;i++){
            int lastStep=0;
            if(arr[i]==arr[i-1]) continue;
            if(arr[i]>arr[i-1]){
                step++;
                minDrop = i - step;
                lastStep = step;
            }
            else{
                if(step!=0){
                ArrayList<Integer> allPairsInBetween = new ArrayList<>();
                allPairsInBetween.add(minDrop);
                allPairsInBetween.add(minDrop+step);
                System.out.println("-"+allPairsInBetween);
                ans.add(allPairsInBetween);
                }
                step = 0;
            }
            if(i==n-1 && (minDrop!=(minDrop+lastStep))){
                System.out.println(i);
                ArrayList<Integer> lastPair = new ArrayList<>();
                lastPair.add(minDrop);
                lastPair.add(minDrop+lastStep);
                System.out.println(lastPair);
                ans.add(lastPair);}
        }
        System.out.println(ans);
    }

    public static void main(String[] args){
        // int arr[] = {11, 42 ,49 ,96 ,23 ,20 ,49 ,26 ,26 ,18 ,73 ,2 ,53 ,59 ,34 ,99 ,25,21};
        // int abr[] = {0,1,2,3,4,5};
        int acr[] = {100,180,260,310,40,535,695};
        System.out.println("Array");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println("");
        stockBuySell(acr);
        // ArrayList<ArrayList<Integer>> ans = stockBuySell(arr,n);
        // System.out.println(ans);
    }
}
