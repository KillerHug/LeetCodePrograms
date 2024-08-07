class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i1 = 0, i2 = 0;
        while (i1 < word1.length() && i2 < word2.length()) {
            res.append(word1.charAt(i1++));
            res.append(word2.charAt(i2++));
        }
        if (i1 < word1.length()) {
            res.append(word1.substring(i1));
        }
        if (i2 < word2.length()) {
            res.append(word2.substring(i2));
        }
        return res.toString();
    }
}