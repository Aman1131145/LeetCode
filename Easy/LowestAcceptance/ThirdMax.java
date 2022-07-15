class Solution {
    public int thirdMax(int[] nums) {
//         Arrays.sort(nums);
//         int l = nums.length;
//         int n = 0;
//         int ans = 0;
//         int prev = Integer.MAX_VALUE;
//         for(int i = l-1; i >= 0; i--){
//             int num = nums[i];
//             if(prev == num){
//                 continue;
//             }else if(prev > num){
//                 if(n == 2){
//                     ans = num;
//                 }
//                 prev = num;
//                 n++;
//                 // System.out.println(n);
               
//             }
//         }
//         if(n < 3){
//             ans = nums[l-1];
//             // System.out.println(nums[l-1]);
//         }
//         return ans;
        
        // ANOTHER APPROACH
        // Integer max1 = null;
        // Integer max2 = null;
        // Integer max3 = null;
        // for (Integer n : nums) {
        //     if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
        //     if (max1 == null || n > max1) {
        //         max3 = max2;
        //         max2 = max1;
        //         max1 = n;
        //     } else if (max2 == null || n > max2) {
        //         max3 = max2;
        //         max2 = n;
        //     } else if (max3 == null || n > max3) {
        //         max3 = n;
        //     }
        // }
        // return max3 == null ? max1 : max3;
        
        // ANOTHER APPROACH
        long max = Long.MIN_VALUE, sMax = Long.MIN_VALUE, tMax = Long.MIN_VALUE;
        for (int i : nums) {
            if (i > max) {
                tMax = sMax;
                sMax = max;
                max = i;
            } else if (i > sMax && i != max) {
                tMax = sMax;
                sMax = i;
            } else if (i > tMax && i != sMax && i != max) {
                tMax = i;
            }
        }
		
		// if thirdMax was not updated, return the first Max
		return tMax == Long.MIN_VALUE ? (int) max : (int) tMax;
    }
}