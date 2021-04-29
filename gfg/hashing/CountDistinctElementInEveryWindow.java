import java.util.*;

public class CountDistinctElementInEveryWindow{
    static ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<k;i++){
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }
        list.add(hash.size());
        // System.out.println(hash);
        for(int i=k;i<n;i++){
            hash.put(arr[i-k],hash.get(arr[i-k])-1);
            if(hash.get(arr[i-k])==0){
                hash.remove(arr[i-k]);
            }
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
            // System.out.println(hash);
            list.add(hash.size());
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,3,4,2,3};
        int n = arr.length;
        int k = 4;
        ArrayList<Integer> a = countDistinct(arr, n, k);
        System.out.println(a);
    }
}
