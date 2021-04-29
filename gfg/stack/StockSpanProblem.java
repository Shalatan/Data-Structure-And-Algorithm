import java.util.*;

class StockSpanProlem{
    // Function to calculate span
    // price[]: input array
    public static ArrayList calculateSpan(int arr[], int n)
    {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);

        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false&&arr[s.peek()]<=arr[i])
                s.pop();
            int span = s.isEmpty()?i+1:i-s.peek();
            res.add(span);
            s.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int price[] = {100,80,60,70,60,75,85};
        int n = price.length;
        ArrayList a = calculateSpan(price, n);
        System.out.println(a);
    }
}