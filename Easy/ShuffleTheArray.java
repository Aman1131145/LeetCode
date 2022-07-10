import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sentences[] = new int[n];
        for(int i = 0; i < n; i++){
            sentences[i] = sc.nextInt();
        }
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(shuffle(sentences, n));            
        }
        sc.close();
    }
    
    public static int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        int k = 0;
        for(int i = 0; i < n*2; i++){
            ans[i] = nums[k];
            ans[i+1] = nums[k+n];
            i++;
            k++;
        }
        return ans;
    }
}
