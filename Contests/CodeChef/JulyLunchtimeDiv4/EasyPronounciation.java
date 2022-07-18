package Contests.CodeChef.JulyLunchtimeDiv4;
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
		    int l = sc.nextInt();
		    String k = sc.next();
	        int count = 0;
		    for(int j = 0; j < l; j++){
		        char c = k.charAt(j);
		        if(c=='u'||c=='o'||c=='i'||c=='e'||c=='a'){
		            count = 0;
		            continue;
		        }else{
    		        count++;
		        }
		        if(count>=4){
		            System.out.println("NO");
		            break;
		        }
		    }
		    if(count < 4){
                System.out.println("YES");
		    }
		}
	}
}
