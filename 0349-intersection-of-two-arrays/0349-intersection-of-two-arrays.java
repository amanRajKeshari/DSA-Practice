import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // created HashSet to store the nums1 element.
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        // created new hashset to store the result.
        HashSet<Integer> result = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
           if(set.contains(nums2[i])){
            result.add(nums2[i]);
           }
        }

        int[] arr = new int[result.size()];
        int index = 0;

        for(int num : result){ // Enhanced for loop 
            arr[index] = num;
            index++;
        }

        return arr;
    }

    }

