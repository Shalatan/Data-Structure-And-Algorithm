public class StockBuySellProfit {

    static int maxProfit(int arr[],int n){
        int profit = 0;
        for(int i = 1;i<n;i++){
            if(arr[i]>arr[i-1]){
                profit = profit + (arr[i]-arr[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int arr[] = {1,5,3,8,12};
        int n = arr.length;
        System.out.println("Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int profit = maxProfit(arr,n);
        System.out.println("Max Profit = "+profit);
    }
}
