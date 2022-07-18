/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
        //step 1 string input
            //take size of string
            int n=s.nextInt();
            String str=s.next();
            char[] ch=str.toCharArray();
            //take 2 more strings to store even and odd indices walib strings
            String a="";//even indices
            String b="";//odd indices
            //store characters at even indices
            for(int i=0;i<str.length();i+=2){
                //even indices
                a+=ch[i];
            }
            for(int i=1;i<str.length();i+=2){
                //odd indices
                b+=ch[i];
            }
           // System.out.println(a);
          //  System.out.println(b);
            //sort a and b
            //convert a to char array
            char[] c1=a.toCharArray();
            Arrays.sort(c1);

            //System.out.println(new String(c1));

            //sorting b
            //convert b to char array
            char[] c2=b.toCharArray();
            Arrays.sort(c2);
            //System.out.println(new String(c2));
            boolean ans=Arrays.equals(c1,c2);
            if(ans){
                System.out.println("yes");//palindrome
            }else{
                System.out.println("no");//not palindrome
            }
            t--;
        }
	}
}
