import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void super_reduced_string(String s){
        
        // Complete this function
        StringBuilder sb = new StringBuilder();
        String res="";
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++)
        {
            Character ch = s.charAt(i);
            if(!st.isEmpty() && ch == st.peek())
            {
                st.pop();
            }
            else
                st.push(ch);
        }
        if(st.isEmpty())
           System.out.println("Empty String");
        else
            for(Character c : st)
            {
                System.out.print(c);
            }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        super_reduced_string(s);
       
    }
}
