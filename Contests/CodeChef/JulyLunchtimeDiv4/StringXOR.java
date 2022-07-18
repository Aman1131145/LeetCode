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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String s1 = sc.next();
		    String s2 = sc.next();
		    StringBuffer oz = new StringBuffer();
		    StringBuffer zo = new StringBuffer();
		    int co = 0;
		    for(int i=0;i<n;i++){
		        if(i%2 == 0){
		            oz.append('1');
		            zo.append('0');
		        }else{
		            oz.append('0');
		            zo.append('1');
		        }
		        if(s1.charAt(i) == '1')
		            co++;
		    }
		    if(co>0){
		        if(s2.contentEquals(oz)||s2.contentEquals(zo)){
		            if(s1.equals(s2)){
		                System.out.println("YES");
		            }else{
		                System.out.println("NO");
		            }
		        }else{
		            System.out.println("YES");
		        }
		    }else{
		        if(s1.equals(s2)){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    }
		}
	}
}
