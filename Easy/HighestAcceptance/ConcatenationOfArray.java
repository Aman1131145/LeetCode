class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
        }
        int num = 0;
        for(int i = n; i < ans.length; i++){
            ans[i] = nums[num];
            num++;
        }
        return ans;
    }
}