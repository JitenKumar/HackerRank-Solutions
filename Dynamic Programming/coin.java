import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static long func(int coins[] , int n)
    {
        long [] sol = new long[n+1];
         sol[0] = 1;
        for(int coin : coins )
        {
            for(int i =1;i<sol.length ;i++){
                if(i>=coin){
                    sol[i]+= sol[i-coin];
                }
            }
        }
        return sol[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(func(coins , n));
    }
}
