package Solutions;
import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int sub = target-arr[i];
            if(hash.containsKey(sub)){
                return new int[] {hash.get(sub),i};                
            }
            hash.put(arr[i],i);
        }
        return new int[]{0,0};
    }
    
    public static void main(String[] args) {
        
    }
}
