public class Remove_Duplicates(26) {
    public int removeDuplicates(int[] nums) {
        int count=0;
        if(nums.length==0 || nums==null){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[count]){
                count++;
                nums[count]=nums[i];
            }
        }
        return count +1;
    }
}
