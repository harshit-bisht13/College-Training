import java.util.Scanner;

public class stringToIntusingrecursion {
    public static int toInt(String s){
        if(s.length()==0){
            return 0;
        }
        int digit=s.charAt(0)-'0';
       int remaining=toInt(s.substring(1));
        return digit*(int)Math.pow(10,s.length()-1)+remaining;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=sc.next();
        System.out.print(toInt(s));
    }
}
