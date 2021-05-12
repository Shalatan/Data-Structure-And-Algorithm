package Solutions;
import java.util.*;

public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
            }else{
                hash.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
