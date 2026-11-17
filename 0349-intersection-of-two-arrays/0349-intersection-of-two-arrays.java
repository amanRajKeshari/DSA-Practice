import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        int k = 0;

        int[] result = new int[1000];

        while(i < nums1.length && j < nums2.length) {

            if(nums1[i] == nums2[j]) {

                if(k == 0 || result[k-1] != nums1[i]) {
                    result[k] = nums1[i];
                    k++;
                }

                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        int[] ans = new int[k];

        for(int x = 0; x < k; x++) {
            ans[x] = result[x];
        }

        return ans;
    }
}