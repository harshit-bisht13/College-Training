public class KokoEatingBananas875 {
    public long Calculate(int[] piles, int speed){
        long hours=0;
        for(int pile:piles){
            hours += (pile + speed - 1) / speed;
        }
        return hours;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int pile: piles){
            high=Math.max(pile,high);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalhrs=Calculate(piles,mid);
             if (totalhrs <= h) {
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
