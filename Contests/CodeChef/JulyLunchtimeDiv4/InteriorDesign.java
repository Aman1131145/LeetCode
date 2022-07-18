package Contests.CodeChef.JulyLunchtimeDiv4;
/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i< n; i++){
    		int x1 = sc.nextInt();
    		int y1 = sc.nextInt();
    		int x2 = sc.nextInt();
    		int y2 = sc.nextInt();
    		System.out.println(Math.min(x1+y1,x2+y2));
		}
	}
}
