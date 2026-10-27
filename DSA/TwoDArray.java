import java.util.*;
public class TwoDArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("Enter the elements:" );
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix Display: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        System.out.println("Matrix Sum: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum: "+sum);
        sc.close();
    }
}