class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        Set<Character> vowels = new HashSet<>();
        for (char v : "aeiouAEIOU".toCharArray()) {
            vowels.add(v);
        }
        int left=0,right=s.length()-1;
        while (left<right){
            while (left < right && !vowels.contains(c[left])) {
                left++;
            }
            while (left < right && !vowels.contains(c[right])) {
                right--;
            }
            if (left < right) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(c);
    }
}