import java.util.Scanner;

/**
 * MaximumWords
 */
public class MaximumWords {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String sentences[] = new String[n];
            for(int i = 0; i < n; i++){
                sentences[i] = sc.next();
            }
            System.out.println(mostWordsFound(sentences));
            sc.close();
        }
    }
    public static int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(String s : sentences){
            int num = 1;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    num++;
                }
            }
            if(num > ans){
                ans = num;
            }
        }
        return ans;
    }
}