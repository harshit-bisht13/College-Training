import java.util.*;
class RecursionPractice {
    public int printSum(int n){
        if(n==0){
            return 0;
        }
        return n%10+printSum(n/10);
    }
    public int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        rev=rev*10+(n%10);
        return reverse(n/10,rev);
    }
    public static void main(String[] args) {
        Main m=new Main();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Reverse: "+m.reverse(n,0));
        System.out.println("Sum:"+m.printSum(n));
    }
}