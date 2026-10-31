import java.util.*;

public class Print_Min_AND_MAX_Using_RECURSION {
    public void print(int[] arr,int i, int max, int min){
        if(i==arr.length){
                System.out.println("Max: "+max);
                System.out.println("Min: "+min);
                return;
        }
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                    min=arr[i];
            }
         print (arr,i+1,max,min);
    }
    public static void main(String[] args) {
        Main m=new Main();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
        m.print(arr,0,max,min);
    }
}
