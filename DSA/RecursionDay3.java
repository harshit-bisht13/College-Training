import java.util.*;
public class RecursionDay3 {
    public static int print(int x,int pow){
        if(pow==1){
            return x;
        }
        int half=print(x,pow/2);
        if(pow%2==0){
            // int half=print(x,pow/2);
           return half*half;
        }
        // return x*print(x,pow-1);
        return x*half*half;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=sc.nextInt();
        System.out.print("Enter the power: ");
        int pow=sc.nextInt();
        System.out.println(print(x,pow));
    }
}
