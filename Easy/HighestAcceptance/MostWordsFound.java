class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(String s : sentences){
            int num = 1;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    num++;
                }
            }
            if(num > ans){
                ans = num;
            }
        }
        return ans;
    }
}