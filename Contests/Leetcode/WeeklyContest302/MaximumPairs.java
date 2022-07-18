class Solution {
    public int[] numberOfPairs(int[] nums) {
        int ans[] = new int[2];
        ans[1] = nums.length;
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] == nums[j] && nums[i] >= 0){
                    ans[0]++;
                    ans[1]-=2;
                    nums[i]=-1;
                    nums[j]= -1;
                }
            }
        }
        return ans;
    }
}