public class Reverse_vowels_of_a_string(345) {
    public boolean isVowel(char c){
        if(c== 'a'|| c=='e' || c=='i' || c=='o' || c=='u'
            || c=='A' || c=='E' || c=='I' || c=='O'|| c=='U'){
                return true;
            }
        return false;
    }
        public String reverseVowels(String s) {
            char[] ch=s.toCharArray();
            int i=0;
            int j=ch.length-1;
            while(i<j){
                while(i<j && !isVowel(ch[i])){
                    i++;
                }
                while(i<j && !isVowel(ch[j])){
                    j--;
                }
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            return new String(ch);
    }
}
