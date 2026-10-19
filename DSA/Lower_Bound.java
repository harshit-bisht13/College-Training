public class Lower_Bound{
    int lowerBound(int[] arr, int target) {
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=target){
                end=mid;
            }else{
                start=start+1;
            }
        }
        return start;
    }
}