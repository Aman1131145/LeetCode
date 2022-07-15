class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int preprev = Integer.MIN_VALUE;
        int fault = 0;
        for(int i = 0; i < nums.length; i++){
            if(prev < nums[i]){
                if(i != 0){
                    preprev = prev;
                }
                prev = nums[i];
            }else{
                fault++;
                if(i > 1){
                    prev = preprev;
                }
            }
        }
        if(fault <= 1){
            return true;
        }else{
            return false;
        }
    }
}