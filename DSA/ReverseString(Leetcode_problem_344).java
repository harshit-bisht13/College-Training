public class ReverseString(Leetcode_problem_344) {
    public void reverseString(char[] s) {
        char temp;
        int end=s.length-1;
        for(int start=0;start<end;start++){
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            end--;
        }
    }
}
