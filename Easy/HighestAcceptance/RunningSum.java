class Solution {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            ans[i] = num+nums[i];
            num = ans[i];
        }
        return ans;
    }
}