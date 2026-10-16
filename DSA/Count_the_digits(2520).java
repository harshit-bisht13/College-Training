public class Count_the_digits(2520) {
     public int countDigits(int num) {
        int temp=num;
        int count=0;
        while(temp!=0){
            int x=temp%10;
            if(temp!=0 && num%x==0){
                count++;
            }
            temp/=10;
        }
        return count;
     }
}
