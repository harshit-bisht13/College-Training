public class A_number_afterr_a_double_reversal(2119) {
     public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev=0;
        while(temp!=0){
            int x=temp%10;
            rev=rev*10+x;
            temp/=10;
        }
        temp=rev;
        rev=0;
        while(temp!=0){
            int x=temp%10;
            rev=rev*10+x;
            temp/=10;
        }
        return num==rev;
     }
}
