class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int k = 0;
        for(int i = 0; i < n*2; i++){
            ans[i] = nums[k];
            ans[i+1] = nums[k+n];
            i++;
            k++;
        }
        return ans;
    }
}