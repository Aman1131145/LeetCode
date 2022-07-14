import java.util.Scanner;

/**
 * NumberOfGoodPairs
 */
public class NumberOfGoodPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(numIdenticalPairs(nums));
        sc.close();
    }

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