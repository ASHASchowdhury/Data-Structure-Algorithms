class Solution {
    public int charv(char c){
        if(c=='I') return 1;
        else if(c=='V') return 5;
         else if(c=='X') return 10;
          else if(c=='L') return 50;
           else if(c=='C') return 100;
            else if(c=='D') return 500;
             else if(c=='M') return 1000;
             else return 0;

    }
    public int romanToInt(String s) {
        int n=0; 
        int i;
        for( i=0;i<s.length()-1;i++){
            if(charv(s.charAt(i))<charv(s.charAt(i+1))){
                n+=charv(s.charAt(i+1))-charv(s.charAt(i));
                i++;
            }
            else{
                n+=charv(s.charAt(i));
            }
        }
        if(i!=s.length()){
            n+=charv(s.charAt(i));
        }
        return n;
    }
}
