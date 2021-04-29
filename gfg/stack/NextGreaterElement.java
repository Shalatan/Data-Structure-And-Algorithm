import java.util.*;

class NextGreaterElement{
    // Function to calculate span
    // price[]: input array
    public static ArrayList nextLargerElement(int[] arr, int n) { 

        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);

        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(s.isEmpty()==false&&s.peek()<=arr[i])
                s.pop();
            int k = s.isEmpty()?-1:s.peek();
            res.add(k);
            s.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int price[] = {20,30,10,5,15};
        int n = price.length;
        ArrayList arr = nextLargerElement(price, n);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}