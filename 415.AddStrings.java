public class Solution {
    public String addStrings(String num1, String num2) {
        String result = "";
        int i = 1;
        int leftIndex = num1.length() - i;
        int rightIndex = num2.length() - i;
        int carry = 0;
        while (leftIndex >= 0 || rightIndex >= 0 || carry > 0) {
            int left = 0;
            if (leftIndex >= 0) {
                left = num1.charAt(leftIndex) - '0';
            }
            int right = 0;
            if (rightIndex >= 0) {
                right = num2.charAt(rightIndex) - '0';
            }
            int sum = left + right + carry;
            carry = sum / 10;
            sum = sum % 10;
            result = sum + result;
            i++;
            leftIndex = num1.length() - i;
            rightIndex = num2.length() - i;
        }
        return result;
    }
}
