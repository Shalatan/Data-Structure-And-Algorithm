public class MaxSubarray {
    
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int maxHere = nums[0];
        for(int i=1;i<nums.length;i++){
            maxHere = Math.max(maxHere+nums[i],nums[i]);
            max = Math.max(maxHere,max);
        }
        return max;
    }

    public static void main(String[] args) {
        
    }
}
