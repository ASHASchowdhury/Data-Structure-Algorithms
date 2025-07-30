class Solution {
    public int lengthOfLastWord(String s) {
    
        String sen = s.trim();

  
        int lastSpaceIndex = sen.lastIndexOf(" ");

       
        if (lastSpaceIndex == -1) {
            return sen.length();
        }

        return sen.length() - (lastSpaceIndex + 1);
    }
}
