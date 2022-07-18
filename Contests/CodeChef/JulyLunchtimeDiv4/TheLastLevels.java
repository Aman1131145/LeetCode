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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    int sum = 0;
		    int count = 0;
		    while(x > 0){
		        if(count == 3){
		            sum += z;
		            count = 0;
		        }
		        sum += y;
		        count++;
		        x--;
		    }
		    System.out.println(sum);
		}
	}
}
