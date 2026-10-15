public class SecondLargest {
     public int getSecondLargest(int[] arr) {
        int largest=Integer.MIN_VALUE;
        int secondL=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>largest){
                secondL=largest;
                largest=x;
            }
            else if(x<largest && x>secondL){
                secondL=x;
            }
        }
        return secondL==Integer.MIN_VALUE?-1:secondL;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        SecondLargest sol = new SecondLargest();
        int result = sol.getSecondLargest(arr);

        System.out.println("Second largest element: " + result);
    }
}
