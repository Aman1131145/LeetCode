import java.util.Scanner;

public class ConcatinationOfArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int[] ans = getConcatenation(nums);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        sc.close();
    }
    
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
        }
        int num = 0;
        for(int i = n; i < ans.length; i++){
            ans[i] = nums[num];
            num++;
        }
        return ans;
    }
}
