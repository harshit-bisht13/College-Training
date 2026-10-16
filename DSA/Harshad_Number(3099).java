public class Harshad_Number(3099) {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int temp=x;
        while(temp>0){
            int n=temp%10;
            sum=sum+n;
            temp/=10;
        }
        if(x%sum==0){
            return sum;
        }
        return -1;
    }
}
