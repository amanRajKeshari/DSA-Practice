class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        for (int num : nums){
            total += num;
        }

        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            int suffix = total - prefix - nums[i];

            if (prefix == suffix) {
                return i;
            }

            prefix += nums[i];
        }

        return -1;
    }
}