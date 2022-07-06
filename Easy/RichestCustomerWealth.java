import java.util.Scanner;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            for(int j = 0; j < m; j++){
                arr[i][m] = sc.nextInt();
            }
        }
        System.err.println(maximumWealth(arr));
        sc.close();
    }

    private static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i = 0; i < accounts.length; i++){
            int num = 0;
            for(int j : accounts[i]){
                num += j;
            }
            if(num > ans){
                ans = num;
            }
        }
        return ans;
    }    
}