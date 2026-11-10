
class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;

        long totalSum = 0;
        long leftSum = 0;

        //  total sum
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        //  middle index
        for (int i = 0; i < n; i++) {

            long rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
