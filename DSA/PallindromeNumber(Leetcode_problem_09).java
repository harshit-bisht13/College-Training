public class PallindromeNumber(Leetcode_problem_09) {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int num=x%10;
            rev=rev*10+num;
            x=x/10;
        }
        return temp==rev;
    }
}
