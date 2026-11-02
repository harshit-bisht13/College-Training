import java.util.*;
public class SerarchingUsingRecursion {
    public int binarySearch(int[] arr, int low,int high, int target){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(mid>target){
             return binarySearch(arr,low,mid-1,target);   
        }else{
            return binarySearch(arr,mid+1,high,target);
        }
    }
    public int linearSearch(int[] arr,int idx,int target){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return linearSearch(arr,idx+1,target);
    }
    public static void main(String[] args) {
        Main m=new Main();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=m.linearSearch(arr,0,5);
        if(res!=-1){
            System.out.println("Element fount at:"+res);
        }else{
            System.out.println("Element not found");
        }
        int result=m.binarySearch(arr,0,n,5);
         if(result!=-1){
            System.out.println("Element fount at:"+result);
        }else{
            System.out.println("Element not found");
        }
    }
}
