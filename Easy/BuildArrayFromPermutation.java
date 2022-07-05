import java.util.Scanner;

/**
 * BuildArrayFromPermutation
 */
public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = buildArray(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    private static int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    
}