public class Solution {
    public int reverse(int x) {
        String result = "";
        if (x < 0) {
            result += "-";
            x = -x;
        }
        String input = "" + x;
        for (int i = input.length() - 1; i >= 0; i--){
            result += input.charAt(i);
        }
        try {
            return Integer.parseInt(result);
        } catch (Exception e) {
            return 0;
        }
    }
}
