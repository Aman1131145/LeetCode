class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i = 0; i < accounts.length; i++){
            int num = 0;
            for(int j : accounts[i]){
                num += j;
            }
            if(num > ans){
                ans = num;
            }
        }
        return ans;
    }
}