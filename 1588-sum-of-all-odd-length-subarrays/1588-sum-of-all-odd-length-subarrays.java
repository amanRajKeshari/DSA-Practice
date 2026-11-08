class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;

        int[] pref = new int[n + 1];
        pref[0] = 0;

        // prefix sum array
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + arr[i];
        }

        int total = 0;
        // odd length
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end += 2) {
                total += pref[end + 1] - pref[start];
            }
        }

        return total;
    }
}