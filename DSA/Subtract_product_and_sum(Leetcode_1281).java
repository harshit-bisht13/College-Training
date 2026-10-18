public class Subtract_product_and_sum(Leetcode_1281) {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while(n!=0){
            int num=n%10;
            product=product*num;
            sum=sum+num;
            n/=10;
        }
        return product-sum;
    }
}
