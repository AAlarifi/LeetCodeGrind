class Solution {
    public boolean isPalindrome(String s) {
        String string = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = reverse(string);
        if (reversed.equals(string)) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}