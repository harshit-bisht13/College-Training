public class Add_Digits(258) {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        while(num>=10){
            int sum=0;
            while(num>0){
                int x=num%10;
                sum=sum+x;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}
