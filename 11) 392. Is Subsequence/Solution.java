class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.contains(s))
            return true;
        int lastIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (t.contains(String.valueOf(c))) {
                lastIndex = t.indexOf(c)+1;
                t = t.substring(lastIndex);
            } else {
                return false;
            }
        }
        return true;
    }
}