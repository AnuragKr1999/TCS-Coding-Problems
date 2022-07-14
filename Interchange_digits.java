import java.util.*;

/* Problem :
    Compute the nearest larger number by interchanging its digits updated.
    Given 2 numbers a and b find the smallest number greater than b by interchanging the digits of a and if not possible print -1.
 */


public class Interchange_digits {
    public static void main(String[] args) {
        int a = 645757 , b = 457765;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        int[] ans = new int[1];
        ans[0] = Integer.MAX_VALUE;
        permutation(0, sb, ans, b);
        if(ans[0]>b)
            System.out.println(ans[0]);
        else
            System.out.println("-1");

    }

    static void permutation(int idx, StringBuilder sb, int[] ans, int b) {
        if(idx == sb.length()) {
            int x = Integer.parseInt(sb.toString());
            //System.out.println(x);
            if(x>b)
                ans[0] = Math.min(ans[0], x);
            return;
        }
        
        for(int i=idx; i<sb.length(); i++) {
            swap(sb, i, idx);
            permutation(idx+1, sb, ans, b);
            swap(sb, i, idx);
        }
    }
    
    static void swap(StringBuilder sb, int i, int j) {
        char ch = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, ch);
    }
}


