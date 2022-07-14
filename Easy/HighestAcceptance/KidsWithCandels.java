class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int largestNumber = 0;
        for(int i : candies){
            if(i > largestNumber){
                largestNumber = i;
            }
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i]+extraCandies >= largestNumber){
                arr.add(true);
            }else{
                arr.add(false);
            }
        }
        return arr;
    }
}