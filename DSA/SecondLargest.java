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
}
