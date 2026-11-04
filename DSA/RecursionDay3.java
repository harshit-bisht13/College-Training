import java.util.*;
public class RecursionDay3 {
class Main {
    public int print(int x,int pow){
        if(pow==0){
            return 1;
        }
        if(pow%2==0){
            int half=print(x,pow/2);
            return half*half;
        }
        return x*print(x,pow-1);
    }
    public static void main(String[] args) {
        Main m=new Main();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=sc.nextInt();
        System.out.print("Enter the power: ");
        int pow=sc.nextInt();
        System.out.println(m.print(x,pow));
    }
}
