/*
 Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment 
 problems before the lecture. Today he got one tricky question. The problem statement is -A positive integer has been given as an input. 
 Convert decimal value to binary representation. Toggle all bits of it after 
 the most significant bit including the most significant bit. Print the positive integer value after toggling all bits
 */

 import java.util.*;

public class Decimal_to_BinaryToggle {
    public static void main(String[] args) {
        int n = 8;
        decimalToBinaryToggle(n);
    }

    public static void decimalToBinaryToggle(int n) {
        String bin = "";
        int x = n;

        System.out.println("Given decimal: " + n);

        // conversion from decimal to binary and storing in string
        while(x != 0) {
            bin = (x&1) + bin;
            x = x>>1;
        }

        System.out.println("Binary of decimal " + n + " : " + bin);

        // 0 to 1 and 1 to 0
        bin = bin.replaceAll ("1", "2");
        bin = bin.replaceAll ("0", "1");
        bin = bin.replaceAll ("2", "0");

        System.out.println("Binary negation: " + bin);

        int len = bin.length();
        int ans = 0;

        for(int i=len-1; i>=0; i--) {

            char ch = bin.charAt(i);
            if(ch == '1')
                ans += Math.pow(2, len-i-1);
        }

        System.out.println("Decimal conversion of this negation: " + ans);

        
        
        
    }

    

}
