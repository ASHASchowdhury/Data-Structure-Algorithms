class Solution {
    public String addBinary(String a, String b) {
          int ia,ib,x;
      ia=Integer.parseInt(a,2);
      ib=Integer.parseInt(b,2);
// remember directly convert the string into binar then sum and return into binary string
      x= ia+ib;
      String sum=Integer.toBinaryString(x);

      return sum;
    }
}
