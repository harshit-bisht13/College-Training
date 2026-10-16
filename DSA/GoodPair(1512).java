public class Goodpair(1512){
     public int numIdenticalPairs(int[] nums) {
        int[] freq=new int[101];
        int count=0;
        for(int num: nums){
            count+=freq[num];
            freq[num]++;
        }
        return count;
     }
}