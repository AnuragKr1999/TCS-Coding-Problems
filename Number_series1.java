/*
 * Ques. Find the 15th term of the series?

        0,0,7,6,14,12,21,18, 28
 */

public class Number_series1 {
    public static void main(String[] args) {
        int n = 18;

        System.out.println(findNthTerm(n));
    }

    static int findNthTerm(int n) {
        if(n == 1 || n == 2) return 0;
        if(n == 3) return 7;

        int x = n;
        x = x-2;

        if(n%2 == 0) {
            return (x/2)*6;
        }

        return (n/2)*7;
    }
}
