import java.util.Scanner;

public class JwelsAndStones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String J = sc.next();
        String S = sc.next();
        System.out.println(numJewelsInStones(J,S));
        sc.close();
    }

    private static int numJewelsInStones(String j, String s) {
        int[] cnt = new int[128];
        for (char c : s.toCharArray())
            cnt[c]++;
        int ans = 0;
        for (char c : j.toCharArray())
            ans += cnt[c];
        return ans;
    }
    
}
