/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int tc = 0; tc < testCase; tc++) {

            int n = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> brr = new ArrayList<>();
            ArrayList<Integer> crr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                arr.add(val);
            }
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                brr.add(val);
            }

            Collections.sort(arr);
            Collections.sort(brr);

            int mid = n / 2;
            int k = n - 1;

            for (int i = mid; i < n; i++) {

                int val = arr.get(i) + brr.get(k);
                k--;
                crr.add(val);
            }

            Collections.sort(crr);

            System.out.println(crr.get(0));

        }

        sc.close();
    }
}
