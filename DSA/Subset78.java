import java.util.ArrayList;
import java.util.List;

public class Subset78 {
    public void recursion(int[] nums,int idx,List<Integer> current, 
    List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(current));
            return ;
        }
        current.add(nums[idx]);
        recursion(nums,idx+1,current,ans);
        current.remove(current.size()-1);
        recursion(nums,idx+1,current,ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        recursion(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}
