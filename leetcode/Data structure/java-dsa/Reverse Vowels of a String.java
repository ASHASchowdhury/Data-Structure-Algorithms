class Solution {

      public boolean checkvow(char i){
        return "aeiouAEIOU".indexOf(i)!=-1;
    }

    public String reverseVowels(String s) {
              char[] D = s.toCharArray();
        int i=0;
        int j=D.length-1;
        while(i<=j){
            if(i<j && !checkvow(D[j])){
                j--;
            } else if (i<j && !checkvow(D[i])) {
                i++;
            }
            else{
                char temp= D[i];
                D[i]=D[j];
                D[j]=temp;
                i++;
                j--;}
        }
        return new String(D);
    }
}
