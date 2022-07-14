class Solution {
    public int numJewelsInStones(String J, String S) {
        int res=0;
       for(char c : S.toCharArray()){
           if(J.indexOf(c) != -1){
               res++;
           }
       }
       return res;
    }
}