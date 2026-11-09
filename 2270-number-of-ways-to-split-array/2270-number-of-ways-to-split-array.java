
class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;

        long totalSum = 0;
        long leftSum = 0;
        int count = 0;

        // total sum
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        // left and right sums
        for (int i = 0; i < n - 1; i++) {
            leftSum += nums[i];

            long rightSum = totalSum - leftSum;

            //  Check valid split
            if (leftSum >= rightSum) {
                count++;
            }
        }

        return count;
    }
}
