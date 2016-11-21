public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int length = ((int) Math.log10(x) + 1);
        int mid = length / 2;
        for (int i = 0; i < mid; i++) {
            int left = x / (int) Math.pow(10, i) % 10;
            int right = x / (int) Math.pow(10, length - 1 - i) % 10;
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}
