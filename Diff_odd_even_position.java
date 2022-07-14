/*
 * Problem:
 * Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits
 */

public class Diff_odd_even_position {
    public static void main(String[] args) {
        long n = 9834698765123L;
        long ans = digitDiff(n);
        System.out.println(ans);
    }

    static int digitDiff(long n) {
        String s = String.valueOf(n);

        int oddSum = 0, evenSum = 0;
    
        for(int i=0; i<s.length(); i++) {
            if(i%2 == 0)
                oddSum += Integer.parseInt(String.valueOf(s.charAt(i)));  
            else
                evenSum += Integer.parseInt(String.valueOf(s.charAt(i)));  

        }

        return Math.abs(oddSum - evenSum);
    }
}
