class Number_Of_Steps_to_reduce_a_number_to_zero(1342){
    public int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
            }else{
                num=num-1;
            }
            count++;
        }
        return count;
    }
}