import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    
    static BigInteger fib(int num, Map<Integer , BigInteger> fibTable){
        if(fibTable.containsKey(num))
            return fibTable.get(num);
        BigInteger lastFib = fib(num-1,fibTable);
        BigInteger numFib = lastFib.multiply(lastFib).add(fib(num-2,fibTable));
        fibTable.put(num,numFib);
        return numFib;
}
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
     
        Scanner sc = new Scanner(System.in);
        BigInteger t1 = BigInteger.valueOf(sc.nextLong());
        BigInteger t2 = BigInteger.valueOf(sc.nextLong());
        int n = sc.nextInt();   
        Map<Integer , BigInteger> fibTable = new HashMap<>();
        fibTable.put(1,t1);
        fibTable.put(2,t2);
        System.out.println(fib(n,fibTable));
    }
}
