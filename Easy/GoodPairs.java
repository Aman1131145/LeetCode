import java.util.*;
public class GoodPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(numIdenticalPairs(arr));
        sc.close();
    }

    /**
     * @param nums
     * @return
     */
    private static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }
    
}
