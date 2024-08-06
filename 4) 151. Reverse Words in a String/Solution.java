class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
    s = s.trim(); 
    int lastIndex = s.length();
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == ' ') {
            if (i + 1 != lastIndex) { 
                res.append(s.substring(i + 1, lastIndex)).append(" ");
            }
            lastIndex = i;
        }
    }
    res.append(s.substring(0, lastIndex));
    return res.toString().trim(); 
    }
}