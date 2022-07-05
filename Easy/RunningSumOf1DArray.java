import java.util.Scanner;

public class RunningSumOf1DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = runningSum(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    private static int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            ans[i] = num+nums[i];
            num = ans[i];
        }
        return ans;
    }
    
}
