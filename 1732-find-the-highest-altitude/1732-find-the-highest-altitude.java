class Solution {
    public int largestAltitude(int[] gain) {

        int n = gain.length;
        int[] pref = new int[n + 1];

        int max = 0;

        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + gain[i - 1];
        }

        for (int i = 0; i <= n; i++) {
            if (pref[i] > max) {
                max = pref[i];
            }
        }

        return max;
    }
}