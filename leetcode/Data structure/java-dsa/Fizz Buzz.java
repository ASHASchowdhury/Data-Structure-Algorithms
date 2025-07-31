class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> qu=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0  && i%5==0){
                qu.add("FizzBuzz");
            } else if (i%5==0) {
                qu.add("Buzz");
            } else if (i%3==0) {
                qu.add("Fizz");
            }
            else{
                String a=Integer.toString(i);
                qu.add(a);
            }
        }
        return qu;
    }
}
