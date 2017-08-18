// You have  types of coins available in infinite quantities where the value of each coin is given in the array . Can you determine the number
// of ways of making change for  units using the given types of coins? For example if and we can make change for  units in three ways:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long getWays(long n, long[] c){
        // Complete this function
       long [][] sol = new long[c.length + 1][(int)(n + 1)];

		// if amount=0 then just return empty set to make the change
		for (int i = 0; i <= c.length; i++) {
			sol[i][0] = 1;
		}

		// if no coins given, 0 ways to change the amount
		for (int i = 1; i <= n; i++) {
			sol[0][i] = 0;
		}

		// now fill rest of the matrix.
        for(int i =1;i<=c.length;i++){
            for(int j =1;j<=n;j++)
            {
                if(c[i-1]<=j)
                    sol[i][j] = sol[i-1][j] + sol[i][j-(int)c[i-1]];
                else
                    sol[i][j] = sol[i-1][j];
            }
        }
        
       
             return sol[c.length][(int) n];
          }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
