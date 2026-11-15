/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();

        inorder(root, map);

        int maxFreq = 0;

        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == maxFreq) {
                list.add(key);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public void inorder(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) {
            return;
        }

        inorder(root.left, map);

        map.put(root.val, map.getOrDefault(root.val, 0) + 1);

        inorder(root.right, map);
    }
}
