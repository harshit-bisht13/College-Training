public class Sqrt(x){
    public int mySqrt(int x) {

            //BRUTE-FORCE ARROACH
        // int ans=1;
        // for(int i=1;i<x;i++){
        //     if(i*i<=x){
        //         ans=i;
        //     }else{
        //         break;
        //     }
        // }
        // return ans;

            //OPtimal Approach
        int ans=1;
        int low=1;
        int high=x;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<=x/mid){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
