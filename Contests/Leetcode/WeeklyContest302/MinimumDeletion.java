class Solution {
    public int minOperations(int[] nums, int[] d) {
        Arrays.sort(nums);
        int k = 0;
        int i = 0;
        int prev = nums[0];
        for(int j = 1; j < nums.length; j++){
            if(nums[j] == prev){
                nums[j] = -1;
            }else{
                prev = nums[j];
            }
        }
        
        while(k < d.length){
            if(i == nums.length){
                return -1;
            }
            if(d[k]%nums[i]==0 && nums[i]!=-1){
                k++;
            }else{
                i++;
                k=0;
            }
        }
        return i;
    }
}