
class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder(num);

        int i = 0;

        while (k > 0 && i < sb.length() - 1) {

            // Compare the current digit with the next digit
            if (sb.charAt(i) > sb.charAt(i + 1)) {
                sb.deleteCharAt(i); // Remove the greater digit
                k--;

                // Check again from the previous position
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }

        // If digits are in increasing order, remove from the end
        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        // Remove leading zeros
        int j = 0;
        while (j < sb.length() && sb.charAt(j) == '0') {
            j++;
        }

        sb.delete(0, j);

        // If no digits remain, return "0"
        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
    }
}
