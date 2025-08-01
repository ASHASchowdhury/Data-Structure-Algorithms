
 class Solution {

    public boolean chck(char ch, int i) {
        String st = String.valueOf(ch);
        if (i == 1) {
            return "qwertyuiop".contains(st);
        } else if (i == 2) {
            return "asdfghjkl".contains(st);
        } else {
            return "zxcvbnm".contains(st);
        }
    }

    public String[] findWords(String[] words) {
        List<String> hakka = new ArrayList<>();

        for (String word : words) {
            String jo = word.toLowerCase();

            boolean fitsInAnyRow = false;             

            for (int i = 1; i <= 3; i++) {
                int count = 0;
                for (int j = 0; j < jo.length(); j++) {
                    if (chck(jo.charAt(j), i)) {
                        count++;
                    } else {
                        break;                      
                }
                if (count == jo.length()) {
                    fitsInAnyRow = true;           
                    break;                         
                }
            }
            if (fitsInAnyRow) {
                hakka.add(word);                   
            }
        
        }
        return hakka.toArray(new String[0]);      
    }
}
