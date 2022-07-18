//Write your Code here
import java.util.*;

class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- != 0) {
            int n  = sc.nextInt();
            
            int[] arr = new int[n];
            
            for(int i = 0 ; i < n ; ++i) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            
            // for (int x : arr)
            // System.out.print(x + " ");
            // System.out.println("");
            
            int ele = 0, c = 0, ppl = n-1;
            
            for(int i = 0 ; i <  n ; ++i) {
              ele +=  arr[i];
               
               if(arr[i] > ppl)
               break;
               
               ppl = ppl - arr[i];
                
                ++c;
                
                
            }
            // if(ele < (n-1)) c = 0;
            System.out.println(c);
            
        }
    }
}