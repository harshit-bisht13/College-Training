public class Maximum_Subarray(53) {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=Math.max(sum, sum+nums[i]);
            max=Math.max(max, sum);
        }
            return max;
  }
}
