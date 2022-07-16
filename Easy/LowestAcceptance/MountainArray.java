class Solution {
    // public boolean validMountainArray(int[] arr) {
    //     if(arr.length < 3){
    //         return false;
    //     }
    //     int peakHeight = -1;
    //     int prev = -1;
    //     boolean peak = false;
    //     for(int i : arr){
    //         if(i > prev && peakHeight == -1){
    //             prev = i;
    //         }else if(i < prev){
    //             if(peak == false){
    //                 peak = true;
    //                 peakHeight = prev;
    //                 prev = i;
    //             }else if(i < peakHeight){
    //                 prev = i;
    //             }
    //         }else{
    //             return false;
    //         }
    //     }
    //     System.out.println(peakHeight);
    //     if(peak == false){
    //         return false;
    //     }else{
    //         if(arr[0] == peakHeight){
    //             return false;
    //         }else{
    //             return true;
    //         }
    //     }
    // }
    
    // ANOTHER APPROACH
    public boolean validMountainArray(int[] A) {
      if (A.length < 3) return false;
      int start = 0;
      int end = A.length-1;
      while (start < end) {
        if (A[start+1] > A[start]) {
          start++;
        } else if (A[end-1] > A[end]) { 
          end--;
        } else {
          break;
        }
      }
      return start != 0 && end != A.length-1 && start == end;
    }
}