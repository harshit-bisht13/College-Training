class findPermutation{
    public void findpermutation(char[] arr,int index,List<String> ans){
        if(index==arr.length){
            ans.add(new String(arr));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr,index,i);
            findpermutation(arr,index+1,ans);
            swap(arr,index,i);
        }
    }
    
    public void swap(char[] arr, int i, int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        findpermutation(s.toCharArray(),0,ans);
        Collections.sort(ans);
        return ans;
    }
}

