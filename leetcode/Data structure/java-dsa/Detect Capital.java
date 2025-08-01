class Solution {
    public boolean detectCapitalUse(String word) {
         int cap=0;
 int small=0;
 int n=word.length();
 int flag=0;

 for(int i=0;i<word.length();i++){
     char a=word.charAt(i);
     
     if(Character.isLowerCase(a)){
      
         small++;
     }
     else{
           if(i==0){
             flag++;
         }
         cap++;
     }
     
 }
 if(small==n || cap==n || flag==1&& small==n-1){
     return true;
 }
 return false;
    }
}
