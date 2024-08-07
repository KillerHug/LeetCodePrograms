class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int length = gcdString(str1.length(), str2.length());
        return str1.substring(0, length);
    }

    private static int gcdString(int str1, int str2) {
        while(str2!=0){
            int temp=str2;
            str2=str1%str2;
            str1=temp;
        }
        return str1;
    }
}