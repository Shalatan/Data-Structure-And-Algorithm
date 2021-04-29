import java.util.*;

class PreviousGreaterElement{
    // Function to calculate span
    // price[]: input array
    public static ArrayList previousGreater(int arr[], int n)
    {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);

        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false&&s.peek()<=arr[i])
                s.pop();
            int span = s.isEmpty()?-1:s.peek();
            res.add(span);
            s.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int price[] = {20,30,10,5,15};
        int n = price.length;
        ArrayList a = previousGreater(price, n);
        System.out.println(a);
    }
}